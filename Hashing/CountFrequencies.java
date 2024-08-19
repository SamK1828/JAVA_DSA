package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {
    // Mapping
    static void countFrequencyByMapping(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry + " " + entry.getKey() + " " + entry.getValue());
        }
    }

    // For Loop
    public static void countFreqByLoop(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 2, 3, 5 };
        int n = arr.length;
        // countFreq(arr, n);
        System.out.println();
        countFrequencyByMapping(arr, n);
    }
}

package Arrays.Easy;

import java.util.*;

public class RemoveDuplicates {
    static int removeDuplicates(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                // System.out.println(arr[i]);
                i++;
                arr[i] = arr[j];
                
            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 4, 5, 5, 5 };
        int index = removeDuplicates(arr, arr.length);
        System.out.println(index);
        // int slicedarr[] = Arrays.copyOfRange(arr, 0, index);
        // System.out.println(Arrays.toString(slicedarr));
        System.out.println(Arrays.toString(arr));

    }
}

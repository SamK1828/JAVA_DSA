package Arrays.Medium;

import java.util.*;
// import java.util.Collections;

public class PairSum {
    public static ArrayList<Pair<Integer, Integer>> pairSum(ArrayList<Integer> arr, int target, int n) {
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
        Collections.sort(arr);

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                result.add(new Pair<>(arr.get(left), arr.get(right)));
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (result.isEmpty()) {
            result.add(new Pair<>(-1, -1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter the size of the array:");
            int n = scanner.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter the array elements:");
            for (int j = 0; j < n; j++) {
                arr.add(scanner.nextInt());
            }

            System.out.println("Enter the target sum:");
            int target = scanner.nextInt();

            ArrayList<Pair<Integer, Integer>> result = pairSum(arr, target, n);

            System.out.println("Pairs with sum " + target + ":");
            for (Pair<Integer, Integer> pair : result) {
                System.out.println(pair);
            }
        }

        scanner.close();
    }

}

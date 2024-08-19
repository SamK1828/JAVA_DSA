package Arrays.Medium;

import java.util.*;

//by using ArrayList Collection......
class Solution {

    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int ind = -1;
        int n = A.size();
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                ind = i; // breakpoint for next permutation
                break;
            }
        }
        if (ind == -1) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                Collections.swap(A, i, ind);
                break;
            }
        }
        Collections.reverse(A.subList(ind + 1, n));
        return A;
    }
}

public class NextGreaterPermutation {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int[] arr, int k, int n) {
        int start = k;
        int end = n;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] arr) {
        int ind = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) { // 1 3 2
            if (arr[i] < arr[i + 1]) {  // 2 < 3 so break....
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 }; // 1 3 2
        int arr2[] = { 101, 202, 222 }; // 101 222 202
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

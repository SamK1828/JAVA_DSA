package Recursion.Day1;
import java.util.*;
public class reverse_array {
    static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void func1(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - 1 - i] = temp;

        func1(i + 1, arr, n);

    }

    static void reverseForloop(int[] arr, int n) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

    static void reverseWhileloop(int[] arr, int k, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 ={100,200,300,400};
        // way 1
        func1(0, arr, arr.length);
        show(arr);
        reverseWhileloop(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
}

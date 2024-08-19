package Arrays.Easy;

import java.util.*;

public class RotateArrayBy1 {
    static int[] leftrotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;

    }

    static int[] righttrotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }, n = 5;
        System.out.println(Arrays.toString(arr));
        leftrotateArray(arr, n);
        System.out.println("Left Rotated: " + Arrays.toString(arr));

        righttrotateArray(arr, n);
        System.out.println("Right Rotated: " + Arrays.toString(arr));

    }
}

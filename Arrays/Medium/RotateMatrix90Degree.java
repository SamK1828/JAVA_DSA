package Arrays.Medium;

import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    public static void reverseWhileloop(int[] arr) {
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

    public static void rotate(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                swap(mat, i, j);

            }
        }

        for (int i = 0; i < mat.length; i++) {
            reverseWhileloop(mat[i]);
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]).replace(",", ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printArray(mat);
        rotate(mat);
        printArray(mat);
    }
}

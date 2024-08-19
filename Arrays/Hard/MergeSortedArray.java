package Arrays.Hard;

import java.util.*;

public class MergeSortedArray {
    public static void swap(long[] a, long[] b, int i, int j) {
        long temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }

    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        int left = a.length - 1, right = 0;
        while (left >= 0 && right < b.length) 
        {
            if (a[left] > b[right]) {
                swap(a, b, left, right);
                left--;
                right++;
            } 
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

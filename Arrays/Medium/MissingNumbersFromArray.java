package Arrays.Medium;

/*
   Time Complexity = O(max(N, MAX))
   Space Complexity = O(N)
   
   Where 'N' is the length of the array.
   Where 'MAX' element is the maximum element present in the array.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MissingNumbersFromArray {

	public static ArrayList<Integer> missingNumbers(int[] arr, int n) {
		// HashSet to store the array elements.
		HashSet<Integer> map = new HashSet<>();

		// Get the minimum and maximum element.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// Store all the elements in the set.
		for (int i = 0; i < n; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			map.add(arr[i]);
		}

		ArrayList<Integer> ans = new ArrayList<>();

		// if element is not in the set, add the element in the 'ANS'.
		for (int i = min; i <= max; i++) {
			if (!map.contains(i)) {
				ans.add(i);
			}
		}
		return ans;
	}

	//My Approach
	public static ArrayList<Integer> missingNumbers1(int[] arr, int n) {
		Arrays.sort(arr);

		ArrayList<Integer> ar=new ArrayList<>();
		
		for (int i = 0; i < arr.length - 1; i++) 
		{
            if (arr[i + 1] - arr[i] > 1) 
			{
                // Print missing numbers
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) 
				{
                    ar.add(j);
                }
            }
        }
		return ar;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6 };
		System.out.println(missingNumbers(arr, arr.length));

	}
}

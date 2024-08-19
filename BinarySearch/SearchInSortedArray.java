package BinarySearch;

public class SearchInSortedArray {
    public static int search(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k)
                return mid;

            // if duplicates are too in the array like [1,2,3,4,5,4,3,2,1]
            if(arr[low]==arr[mid] && arr[mid] == arr[high])
            {
                low++;
                high--;
                continue;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] <= k && k <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }
}

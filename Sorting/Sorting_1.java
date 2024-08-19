package Sorting;

public class Sorting_1 {

    static void SelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Another Proper Way for Selection Sort

    static int select(int arr[], int i) {
        // selectionSort() sorts arr[]
        int min = i;
        for (int j = i; j < arr.length; j++) {
            {
                if (arr[j] < arr[min])
                    min = j;
            }
        }
        return min;
    }

    static void selectionSort(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

            int min = select(arr, i);

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    static void bubble_sort(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("No Swaps");
                break;
            }
        }
    }

    // Insertion Sort

    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) // for descending arr[j]>arr[j-1]
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -4, 7, -3, 4, -8, 4, 4, 0, -6, -7, 6, 9, 3, 5, 4, -1, -1, -6, -9, 0, 9, -3, 8, 5, 2, 6, 2, 0, 9,
                -4, -3, 0, 0, 8, 4 };
        // SelectionSort(arr); //Worst,Best,Avg --> O(N^2)
        // bubble_sort(arr); //Worst,Avg --> O(N^2) , Best --> O(N)
        insertion_sort(arr, arr.length); // Worst,Average -->O(N^2) , Best --> O(N)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

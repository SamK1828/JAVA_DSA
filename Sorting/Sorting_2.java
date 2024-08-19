package Sorting;

import java.util.Arrays;

public class Sorting_2 
{   

//     //Function to sort an array using quick sort algorithm.
//     static void quickSort(int arr[], int low, int high)
//     {
//         if (low < high) {
//             int pIndex = partition(arr, low, high);
//             quickSort(arr, low, pIndex - 1);
//             quickSort(arr, pIndex + 1, high);
//         }
//     }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j; 
    } 
// }
    // static int findPartitionIndex(int []arr,int low,int high)
    // {   
    //     int pivot=arr[low];
    //     int i=low,j=high;
        
    //     while(i<j)
    //     {
    //         while (arr[i]<=pivot && i<high)
    //         {
    //             i++;
    //         }
    //         while (arr[j]>pivot && j>low) 
    //         {
    //             j++;
    //         }
    //         if(i<j)
    //         {
    //             int temp=arr[i];
    //             arr[i]=arr[j];  
    //             arr[j]=temp;
    //         }
    //     }
    //     //swap with pivot element
        
    //     int temp=arr[low];
    //     arr[low]=arr[j];  
    //     arr[j]=temp;
    //     return j;
    // }
    static void quickSort(int[]arr,int low,int high)
    {
        if(low<high) 
        {
            int pIndex= partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
        
    }

    public static void main(String[] args) 
    {
        int[] arr = { 100, 2, 5, 20, 9, 10 };
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    } 
}

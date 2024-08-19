package Arrays.Medium;
import java.util.*;
public class Sort012 {


    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    public static void sort012(int[] nums) {
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else 
            {
                swap(nums,mid,high);
                high--;
            }
        }   
    }

    //Above Algorithm is also known as Deutch National Flag Algorithm
    public static void main(String[] args) {
        int arr[]={2,1,2,2,2,2,1,1,0,0,1,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}

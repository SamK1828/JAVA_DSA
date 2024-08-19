package Arrays.Medium;

import java.util.Arrays;

public class TwoSum {
    public static String Func(int n, int []book, int target)
    {   
        Arrays.sort(book);
        
        int left=0,right=n-1,sum=0;
        while(left<right)
        {   sum=book[left]+book[right];
            if(sum==target) return "YES";

            else if(sum<target) left++;
            else right--;
        }
        return "NO";
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        System.out.println(Func(arr.length,arr,5));

    }
}

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static String Func(int n, int []book, int target)
    {
        Map<Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            int num=book[i];
            int more=target-num;
            if(mpp.containsKey(more))
            {
                return "YES";
            }
            mpp.put(num, i);
        }
        return "NO";
    }

    //when indexes need to be returned then below approach is preferred

    public int[] twoSum(int[] book, int target) {
        
        Map<Integer,Integer> mpp=new HashMap<>();
        for (int i = 0; i < book.length; i++) 
        {
            int num=book[i];
            int more=target-num;
            if(mpp.containsKey(more))
            {
                return new int[]{mpp.get(more),i};
            }
            mpp.put(num, i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        System.out.println(Func(arr.length,arr,5));

    }
    //Another Approach in "Arrays" Package....
}

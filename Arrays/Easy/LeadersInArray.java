package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray 
{
    public static List< Integer > superiorElements(int []a) {
        int max_leader=Integer.MIN_VALUE;
        int n=a.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>max_leader)
            {
                arr.add(a[i]);
                max_leader=a[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(superiorElements(new int[] {10,20,20,3,3,2}));
    }    
}

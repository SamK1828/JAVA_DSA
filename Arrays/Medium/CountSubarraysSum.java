package Arrays.Medium;

import java.util.HashMap;

public class CountSubarraysSum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // entry set
        int preSum = 0, cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i]; // add to sum ;
            int remove = preSum - s; // subtract target from presum
            cnt += hm.getOrDefault(remove, 0);
            hm.put(preSum, hm.getOrDefault(preSum, 0) + 1);
        }
        return cnt;

    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,-1,3,-1,4,0,9};
        System.out.println(findAllSubarraysWithGivenSum(arr, 3));
    }
}

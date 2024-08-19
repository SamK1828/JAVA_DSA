package Arrays.Easy;

public class MaxConsecutiveOnes {
    static int consecutiveOnes(int n, int[] arr) {

        int oneCount = 0;

        int ans = 0;

        // Iterate over the array.
        for (int num : arr) {

            // Found a 0.
            if (num == 0) {

                // Reset the consecutive one count to 0.
                oneCount = 0;
                continue;
            }

            // Otherwise increase the consecutive one count.
            oneCount++;

            // Update the answer.
            ans = Math.max(ans, oneCount);
        }

        return ans;
    }

    // My Approach
    static int consecutiveOnes1(int n, int[] arr) {
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(count, max);

            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
        System.out.println(consecutiveOnes(arr.length, arr));
        System.out.println(consecutiveOnes1(arr.length, arr));
    }
}

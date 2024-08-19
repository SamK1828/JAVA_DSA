package Arrays.Easy;

public class MissingNumber {
    static int missingNumber(int []a, int N) {
        int xor1=0,xor2=0;
        int n=N-1;

        for (int i = 0; i < n; i++) {
            xor2=xor2^a[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^N;
        return xor1 ^ xor2;
    }
    //My Approach

    static int missingNumber1(int []a, int n) {
    
        int sum1=0;
        int sum2=(n*(n+1))/2;

        for (int i = 0; i < a.length; i++) {
            sum1+=a[i];
        }
        return sum2-sum1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(missingNumber(arr, arr.length));
        System.out.println(missingNumber1(arr, arr.length+1));
    }
}

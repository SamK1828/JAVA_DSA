package Recursion.Day2;

import java.util.*;

public class check_primes {
    public static ArrayList<Integer> primeNumbersTillN_method2(int N) 
	{   
	 	
		 ArrayList<Integer> output = new ArrayList<>();
		 for(int num=2; num<=N; num++){
			 int count = 0;

			 for(int div=2; div*div<=num; div++){
				 if(num%div==0){
					 count++;
					 break;
				 }
			 }
			 if(count==0){
				 output.add(num);
			 }
		 }
		 return output;
	}

    public static ArrayList<Integer> primeNumbersTillN_method1(int N) {
        boolean[] arr = new boolean[N + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i * i <= N; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= N; j = j + i)
                    arr[j] = false;

            }
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++)  {
            if (arr[i] != false)
                l.add(i);
        }
        return l;
    }
    public static void show(ArrayList<Integer> arr )
    {   int count=0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("\nCount of Prime Numbers: "+count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter");
        int num=sc.nextInt();
        sc.close();
        System.out.println("Method 1");
        show(primeNumbersTillN_method1(num));
        System.out.println("Method 2");
        show(primeNumbersTillN_method2(num));





    }
}

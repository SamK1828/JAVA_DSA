package Recursion.Day1;



import java.util.Scanner;


public class fact {
    static int func1(int num)
{
    if(num==0 || num==1) return 1;

    return num*func1(num-1);
    
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int N =sc.nextInt(); 
        sc.close();
        int fact=func1(N);
        System.out.println(fact);

    }
}

package Recursion.Day1;



import java.util.Scanner;

public class fibonaaci {
    static int func1(int num)
    {
        if (num<=1) {
            
            return num;
        }
        System.out.print(num+" ");
        return func1(num-1) + func1(num-2);
    }
    static int func2(int num)
    {
        if (num<=1) {
            return num;
        }
        int f=func2(num-1);
        int l=func2(num-2);

        return f+l;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int N =sc.nextInt(); 
        sc.close();
        System.out.println(func1(N));
        // System.out.println(func2(N));
        
    }
}

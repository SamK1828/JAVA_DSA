package Recursion.Day1;



import java.util.*;
public class sum {
    static void func1(int num,int sum){
        if(num<1) 
        {
            System.out.println("Func1: "+sum);
            return;
        }
        sum+=num;
        num--;
        
        func1(num,sum); //or use func(num-1,sum+num);

    }

    static int func2(int num)
    {
        if(num==0) return 0;

        return num + func2(num-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int N =sc.nextInt();
        sc.close();
        func1(N,0);
        int sum=func2(N);
        System.out.println("Func2: "+sum);
    }
}

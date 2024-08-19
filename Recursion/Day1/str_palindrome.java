package Recursion.Day1;



import java.util.Scanner;

public class str_palindrome {

    static boolean check(String s,int n,int index)
    {   
        if (index>=n/2) return true;
        if(s.charAt(index)!=s.charAt(n-index-1)) return false;
        return check(s,n,index+1);
    }

    static boolean check2(String s,int n,int index)
    {
        while(index<=n-1)
        {
            if(s.charAt(index)!=s.charAt(n-1-index)) return false;
            index++;
        }
        return true;     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String s =sc.nextLine();
        sc.close();

        // if(check(s,s.length(),0)) System.out.println("String is Palindrome");
        // else System.out.println("String is not Palindrome");

        if(check2(s,s.length(),0)) System.out.println("String is Palindrome");
        else System.out.println("String is not Palindrome");



    }
}

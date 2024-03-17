package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        //base cases
        if(n<=1){
            return n;
        }
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}

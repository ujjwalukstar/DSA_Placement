package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f=fact(n-1);
        int fn=n*fact(n-1);
        return fn;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}

package Recursion;

import java.util.Scanner;

public class Sum_N {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s=sum(n-1);
        int sm=n+sum(n-1);
        return sm;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}

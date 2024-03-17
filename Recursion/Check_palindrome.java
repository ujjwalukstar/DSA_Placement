package Recursion;

import java.util.Scanner;

public class Check_palindrome {

    public static boolean is_palindrome(String str,int i,int n){
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        is_palindrome(str,i+1,n);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        //String str="madam";

        int n=str.length();


        if (is_palindrome(str, 0, n)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        System.out.println(is_palindrome(str,0,n));
    }
}

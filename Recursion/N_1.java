package Recursion;

import java.util.Scanner;
public class N_1 {

    public static void nTo1(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        nTo1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        nTo1(n);
    } 
}

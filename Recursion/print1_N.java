package Recursion;

public class print1_N {
    public static void print1ToN(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print1ToN(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=10;
        print1ToN(n);

    }
}

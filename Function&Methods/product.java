import java.util.Scanner;

public class product {

    public static int multiply(int a,int b){
        int c= a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=multiply(a,b);
        System.out.println("a*b="+c);
    
        c=multiply(200, 28);
        System.out.println("a*b="+c);
        System.out.println(multiply(2,4));
    }
}

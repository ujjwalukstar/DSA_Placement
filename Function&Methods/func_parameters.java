import java.util.*;

public class func_parameters {

    public static int add(int num1,int num2){ // formal parameters which passes through a,b in func definition
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b); // arguments or actual parameters in calling statements
        System.out.println("The Sum is:" +sum);
    }
}

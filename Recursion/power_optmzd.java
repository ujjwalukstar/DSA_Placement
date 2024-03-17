package Recursion;

public class power_optmzd {
    public static int power(int a,int n){ //o(logn)
        if(n==0){
            return 1;
        }
        //n is  even
        int halfpower=power(a, n/2);
        int halfpowerSq=halfpower*halfpower;

        //n is odd
        if(n%2!=0){
        halfpowerSq=a*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 8));
        
    }
}

package Recursion;
public class Tiling {
    public static int tiling_prob(int n){
        //base case
        if(n==0 | n==1){
            return 1;
        }
        int fnm1=tiling_prob(n-1); //vertically
        int fnm2=tiling_prob(n-2); //horizontally
        int totalWays=fnm1+fnm2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tiling_prob(4));
    }
}

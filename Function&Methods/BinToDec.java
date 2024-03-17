public class BinToDec {
    public static void BinaryToDecimal(int n){
        int n1=n;
        int decNum=0;
        int pow=0;

        while(n>0){
           int ld=n%10;
           decNum=decNum+(ld*(int)Math.pow(2,pow));
           pow++;
           n=n/10;

        }
        System.out.println("decimal of "+n1+" is:" +decNum);
    }
    public static void main(String[] args) {
        BinaryToDecimal(111);
    }
}

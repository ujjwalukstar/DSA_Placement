public class swap {
    public static void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(+a);
        System.out.println(+b);

        return;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap1(a,b);
        // System.out.println(+a);
        // System.out.println(+b);
        // call by value example

    }
}

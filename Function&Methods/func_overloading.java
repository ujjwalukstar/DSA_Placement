public class func_overloading {

    public static int sum(int a ,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));
        System.out.println(sum(38.3f,83.4f));

    }
}

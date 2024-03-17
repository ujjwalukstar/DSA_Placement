package Arrays;

public class Basic {
    public static void arr1(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+2;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        arr1(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}

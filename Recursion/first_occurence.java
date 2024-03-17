package Recursion;


import java.util.Scanner;

class first_occurence {
    public static int First_occ(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return First_occ(arr, key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(First_occ(arr, 0, 0));
        

    }
}

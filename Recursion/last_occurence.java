package Recursion;

import java.util.Scanner;

public class last_occurence {
    public static int last_occ(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int is_found=last_occ(arr, key, i+1);
        if(is_found==-1 && arr[i]==key){
            return i;
        }
        return is_found;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(last_occ(arr, 1, 0));
//int=16bytes,arr=4,add=8bytes
    }
}

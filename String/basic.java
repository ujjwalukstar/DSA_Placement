package String;

import java.util.Scanner;

public class basic {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char a[]={'a','b','c'};
        String str=("abcd");
        String Str1=new String("xyz");
       
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        String str2=sc.nextLine();

        System.out.println(str2.length());

        String firstname="ujjwal";
        String lastname="Kumar";
        System.out.println(firstname + " " +lastname);

        printletters(firstname);
    }
}

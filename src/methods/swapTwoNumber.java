package methods;

import java.util.Scanner;

public class swapTwoNumber {
    public  static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    public static void main(String[] args) {
     // this is pass by value
        int a = 5;
        int b= 10;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
}

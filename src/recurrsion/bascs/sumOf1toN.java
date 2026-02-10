package recurrsion.bascs;

import java.util.Scanner;

public class sumOf1toN {
//    public static int sum(int n){
//        if(n==1)return 1;            // int return type
//        return n+sum(n-1);
//    }

    public static void sum(int n,int s ){
         if(n==0){
             System.out.println(s);
             return;
         }
          sum (n-1,s+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
       sum(n,0);
    }
}

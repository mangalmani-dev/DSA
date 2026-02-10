package recurrsion.bascs;

import java.util.Scanner;

public class noOfdigit {
//    public static void count(int n,int c){
//        if(n<=0){
//            System.out.println(c);
//            return;
//        }
//        count(n/10,c+1);
//    }
    public static int count(int n){
         if(n==0)return 0;
        return 1 +count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n =sc.nextInt();
        System.out.println(count(n));
    }
}

package recurrsion;

import java.util.Scanner;

public class power {
//    public static int pow(int a,int b){
//        if(a==0 && b==0){
//            System.out.println(" undefined");
//            return -1;
//        }
//         if(b==0)return 1;  // base case
//        return a*pow(a,b-1);
//    }

    public static int pow2(int a,int b){

        if(b==0)return 1;
        int ans= pow2(a,b/2);
         if(b%2==0)return ans*ans;
         else return ans*ans*a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        System.out.println(pow2(a,b));

    }
}

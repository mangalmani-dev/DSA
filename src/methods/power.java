package methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of a :");
        double a= sc.nextInt();
        System.out.print("Enter the value of b :");
        double b= sc.nextInt();
        System.out.println(Math.pow(a,b));
//        int pow=1;
//        for (int i = 1; i <=b ; i++) {
//            pow*=a;
//        }
//        System.out.println(pow);
    }
}

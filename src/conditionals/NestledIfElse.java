package conditionals;

import java.util.Scanner;

public class NestledIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();


        if (a > b) {
            if (b > c) {
                System.out.println("greatest is : " + a);
            } else {
                System.out.println("greatest is : " + c);
            }
        } else {
            if (b > c) {
                System.out.println("greatest is : " + b);
            } else {
                System.out.println("greatest is : " + c);
            }
        }
    }
}


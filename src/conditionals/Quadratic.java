package conditionals;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a= sc.nextByte();
        System.out.print("Enter the value of b :");
        int b= sc.nextByte();
        System.out.print("Enter the value of c :");
        int c= sc.nextByte();
        int d =b*b-4*a*c;
        System.out.println("The discriminat value is :"+d);

        if(d>0){
            System.out.println("roots are real and not equal");
             double root1= (-b + Math.sqrt(d)) /2*a;
            System.out.println("the root1 :"+root1);
            double root2= (+b + Math.sqrt(d)) /2*a;
            System.out.println("the root 2 :"+root2);
        }
        else if(d==0){
            double root3 = -b /(2*a);
            System.out.println("roots are equal"+root3);
        }
        else {
            System.out.println("roots are complex");
        }
    }
}

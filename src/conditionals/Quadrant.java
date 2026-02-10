package conditionals;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the numbers a :");
        int a = sc.nextInt();
        System.out.print("Enter the numbers b :");
        int b = sc.nextInt();
        if(a>0 && b>0) System.out.print("Lies on first Quadrant");
        else if(a<0 && b>0) System.out.print("Lies on second Quadrant");
        else if(a<0 && b<0) System.out.print("Lies on Third  Quadrant");
        else if(a>0 && b<0) System.out.print("Lies on Fourth Quadrant");
        else System.out.print("lies on origin");


    }
}

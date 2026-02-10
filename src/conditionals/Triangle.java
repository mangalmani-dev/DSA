package conditionals;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the side 1 :");
        int side1= sc.nextInt();
        System.out.print("Enter the side 2 :");
        int side2= sc.nextInt();
        System.out.print("Enter the side 3 :");
        int side3= sc.nextInt();

        if(side1==side2&& side2==side3){
            System.out.println("The given triangle is equilateral triangle");
        } else if (side1 ==side2 && side2 !=side3) {
            System.out.println("The given triangle is isoclies triangle");
        }
        else {
            System.out.println("the given triangle is scalen triangle");
        }


    }
}

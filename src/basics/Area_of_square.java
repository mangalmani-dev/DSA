package basics;

import java.util.Scanner;

public class Area_of_square {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of the side :");
        int side =sc.nextInt();
        System.out.println("The area of square is "+ side*side);
    }
}

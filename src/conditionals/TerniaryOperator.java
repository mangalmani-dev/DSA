package conditionals;

import java.util.Scanner;

public class TerniaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n =sc.nextInt();

        // condition ? if true : if false

        System.out.print((n%2)==0 ? "Even numbers" : "Odd numbers");

    }
}

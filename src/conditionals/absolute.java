package conditionals;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();

        // printing the positive numbers
        if (n > 0) {
            System.out.println(n);
        } else {
            System.out.println(-(n));
        }
    }
}

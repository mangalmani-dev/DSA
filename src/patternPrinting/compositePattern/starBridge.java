package patternPrinting.compositePattern;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Top row
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Middle bridge
        for (int i = 1; i <= n - 1; i++) {

            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            // New line after each row
            System.out.println();
        }
    }
}

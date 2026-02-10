package patternPrinting.compositePattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        // Upper half
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {   // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {   // stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

        // Middle line
        for (int j = 1; j <= nst; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower half
        nsp = 1;
        nst = nst - 2;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {   // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {   // stars
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }
}

package patternPrinting.compositePattern;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        
        int nsp=1;
        for (int i = 1; i <=n ; i++) {
            int a =1;
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(a+++" ");   // numbers
            }

            for (int j = 1; j <=nsp ; j++) {
                System.out.print(" "+" ");   // space
                a++;
            }
            nsp+=2;
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(a+++" ");    // numbers
            }
            System.out.println();
        }

    }
}

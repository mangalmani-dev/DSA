package recurrsion.bascs;

import java.util.Scanner;

public class findSumofDigit {
    public static int count(int n) {
        if (n == 0) return 0;
        return (n % 10)+count(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println( count(n));
    }
}

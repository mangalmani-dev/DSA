package methods;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        System.out.print("Enter the value of c :");
        int c = sc.nextInt();
        int ans =Math.max(a,b);
        System.out.println(Math.max(ans,c));



    }
}

package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the gp term you want to print :");
        int n = sc.nextInt();
         // with increment of 2
        int a =1;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a);
            a=a*2;

        }

        // with increment of 3

        int b=1;
        for (int i = 1; i <=n ; i++) {
            System.out.println(b);
            b=b*3;
        }
    }
}

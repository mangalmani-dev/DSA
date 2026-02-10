package basics;

import java.util.Scanner;

public class typeCast {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value : ");
        int n = sc.nextInt();

        double x =(double)n;   // type cast

        System.out.println("Half the given value :" + x/2);
    }
}

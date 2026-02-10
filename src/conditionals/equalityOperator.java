package conditionals;

import java.util.Scanner;

public class equalityOperator {
    public static void main(String[] args) {
        // it tells obout true or false or boolean value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();
        System.out.print("Enter the value of b :");
        int b=sc.nextInt();
        System.out.println(a==b);
        System.out.println(a>=b);
    }
}

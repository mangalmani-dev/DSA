package recurrsion.Problems;

import java.util.Scanner;

public class power {
    public static int power(int a, int b){
        if(a==0 && b==0)return -1;
        if(b==0)return 1;
         return a *power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println(power(a,b));

    }
}

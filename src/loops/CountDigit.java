package loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number n :");
        int n = sc.nextInt();

        int a=0;

        while (n!=0){
            n/=10;
            a+=1;

        }

        System.out.println(a);
    }
}

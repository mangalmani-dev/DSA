package loops;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int a=0;    // prime number man lo

        for (int i = 2; i <n-1 ; i++) {
            if(n%i==0){
                System.out.println("composite number");
                a=1;
                break;   // so don't print multiple times
            }
        }
        if(a==0) System.out.println("prime numbers");
    }
}

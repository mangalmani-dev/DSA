package Dynamic_Programming;

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n){
        if(n<=1)return n;   // base case
        return fibo(n-1)+fibo(n-2);  // function call
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}

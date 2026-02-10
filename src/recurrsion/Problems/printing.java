package recurrsion.Problems;

import java.util.Scanner;

public class printing {
    public static void print(int n){
        if(n==0)return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n = sc.nextInt();
        print(n);
    }
}

package recurrsion;

import java.util.Scanner;

public class print1toN {
    public static void print(int n,int a){
        if(n>a)return;
        System.out.println(n);
        print(n+1,a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);

    }
}

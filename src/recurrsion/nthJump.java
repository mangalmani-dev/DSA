package recurrsion;

import java.util.Scanner;

public class nthJump {
    public static int stair(int n){
       if(n==0 )return 1;
       if(n<0)return 0;
        return stair(n-1)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numberrs :");
        int n= sc.nextInt();
        System.out.println(stair(n));
    }
}

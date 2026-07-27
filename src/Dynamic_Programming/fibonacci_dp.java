package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci_dp {
//    public static int fibo(int n,int []dp){
//        if(n<=1)return n;   // base case
//        if(dp[n]!=-1)return dp[n];
//        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);  // function call
//    }
    public static void main(String[] args) {
//        int [] dp = new int[10];
//        Arrays.fill(dp, -1);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        System.out.println(fibo(n,dp));

        //  Tabulation
        int [] dp = new int[7];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i<=6; i++) {
            dp[i]= dp[i-1]+dp[i-2];
        }
        System.out.println(dp[6]);
    }
}

package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class climb {
//    public static int sclimb(int n, int [] dp){
//        if(n<=2)return n;
//        if(dp[n]!=-1)return dp[n];
//        return dp[n] =sclimb(n-1,dp) + sclimb(n-2,dp);
//    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(sclimb(n,dp));
           int  [] dp = new int[7];
           dp[1]=1;
           dp[2]=2;
        for (int i = 3; i <=6 ; i++) {
            dp[i]= dp[i-1] + dp[i-2];
        }
        System.out.println(dp[6]);
    }
}

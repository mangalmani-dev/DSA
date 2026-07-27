package Dynamic_Programming;

import java.util.Arrays;

public class minCost {
    public static int mincost(int i , int [] cost , int [] dp){

        if (i == 0 || i == 1) {
            return 0;
        }
        if(dp[i]!=-1)return dp[i];

        int takeOneStep = mincost(i - 1, cost,dp) + cost[i - 1];
        int takeTwoSteps = mincost(i - 2, cost,dp) + cost[i - 2];
        return dp[i] =Math.min(takeOneStep ,takeTwoSteps);
    }
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int n = cost.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Minimum Cost: " + mincost(n, cost,dp));
    }
}

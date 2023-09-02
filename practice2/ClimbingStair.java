package com.practice2;

public class ClimbingStair {
    public static void main(String[] args) {
        int n = 3;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }


//    public static void main(String[] args) {
//        int n = 3;
//        int[] dp = new int[n+1];
//        System.out.println(ways(n,dp));
//        System.out.println(dp[n]);
//    }
//    public static int ways(int n,int[] dp){
//        if(n==0) return 1;
//        if(n<0) return 0;
//        return dp[n] = ways(n-1,dp) + ways(n-2,dp);
//    }
}

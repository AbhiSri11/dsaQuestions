package com.practice2;

import java.util.Arrays;

public class HouseRobber1 {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n];
        int[] arr = {7,2,3,6,9,11};
        dp[0] = arr[0];
        for(int i=1;i<n;i++) {
            int pick = arr[i];
            if (i > 1) pick += dp[i - 2];
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        System.out.println(dp[n-1]);
    }



//    public static void main(String[] args) {
//        int n = 6;
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
//        int[] arr = {7,2,3,6,9,11};
//        int p = robber(n-1,arr,dp);
//        System.out.println(p);
//    }
//    static int robber(int i, int[] arr,int[] dp){
//        if(i==0) return arr[i];
//        if(i<0) return 0;
//        if(dp[i]!=-1) return dp[i];
//        int pick = arr[i]+robber(i-2,arr,dp);
//        int not_pick = robber(i-1,arr,dp);
//        return Math.max(pick,not_pick);
//    }
}

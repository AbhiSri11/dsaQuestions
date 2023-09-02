package com.practice2;

import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int[] arr = {7,2,3,6,9,11};
        int p = robber(0,n-1,arr,dp);
        int q = robber(1,n,arr,dp);
        System.out.println(p);
    }
    static int robber(int i, int n, int[] arr,int[] dp){
        if(i==n-1) return arr[i];
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i]+robber(i+2,n,arr,dp);
        int not_pick = robber(i+1,n,arr,dp);
        return Math.max(pick,not_pick);
    }
}

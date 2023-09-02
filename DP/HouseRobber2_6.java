package com.DP;

public class HouseRobber2_6 {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int n=nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) dp[i]=-1;
        if(nums.length == 1) System.out.println(nums[0]);
        for(int i=0;i<nums.length;i++) dp[i]=-1;
        int left = rob(1,nums.length,nums,dp);
        for(int i=0;i<nums.length;i++) dp[i]=-1;
        int right = rob(0,nums.length-1,nums,dp);
        System.out.println(Math.max(left,right));
    }
    public static int rob(int n, int ans, int[] arr,int[] dp){
        if(n>=ans) return 0;
        if(dp[n]!=-1) return dp[n];
        int left = arr[n] + rob(n+2,ans,arr,dp);
        int right = rob(n+1,ans,arr,dp);
        return dp[n] = Math.max(left,right);
    }
}

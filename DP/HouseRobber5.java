package com.DP;

public class HouseRobber5 {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int n=nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) dp[i]=-1;
        int p = rob(0,0,nums,dp);
        System.out.println(p);
    }
    public static int rob(int n, int ans, int[] arr,int[] dp) {
        if (n >= arr.length) return 0;
        if (dp[n] != -1) return dp[n];
        int left = arr[n] + rob(n + 2, ans, arr, dp);
        int right = rob(n + 1, ans, arr, dp);
        return dp[n] = Math.max(left, right);

//        if(n<1) return 0;
////        if(dp[n-1]!=-1) {
////            return dp[n-1];
////        }
//        int left = arr[n - 1] + rob(n - 2, arr, dp);
//        int right = Integer.MIN_VALUE;
//
//        if (n >= 2){
////            if(dp[n-2]!=-1) {
////                return dp[n-2];
////            }
//            right = arr[n - 2] + rob(n - 3, arr, dp);
//        }
//        return dp[n-1] = Math.max(left,right);
//    }
//    public static int rob(int i,int[] arr){
//        if(i>=arr.length) return 0;
//        return Math.max(arr[i]+rob(i+2,arr),rob(i+1,arr));
    }
}

package com.DP;

public class FrogJump3 {
    public static void main(String[] args) {

        // tabulation
        int n= 8;
        int[] arr = {7, 4, 4, 2, 6, 6, 3, 4};
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = arr[1]-arr[0];
        for(int i=2;i<n;i++){
            int left = dp[i-1] + Math.abs(arr[i-1]-arr[i]);
            int right = dp[i-2] + Math.abs(arr[i-2]-arr[i]);
            dp[i] = Math.min(left,right);
        }
        System.out.println(dp[n-1]);



//        int n=4;
//        int[] arr = {10,20,30,10};
//        int[] dp = new int[n+1];
//        for(int i=0;i<=n;i++) dp[i] = -1;
//        frog(n-1,arr,dp);
//        System.out.println(dp[n-1]);
//    }
//    public static int frog(int i, int[]arr, int[]dp){
//        if(i==0){
//            dp[i]=0;
//            return 0;
//        }
//        if(dp[i]!=-1) return dp[i];
//        int left = frog(i-1,arr,dp) + Math.abs(arr[i]-arr[i-1]);
//        int right = Integer.MAX_VALUE;
//        if(i>1) right = frog(i-2,arr,dp) + Math.abs(arr[i]-arr[i-2]);
//        return dp[i] = Math.min(left,right);
    }
}

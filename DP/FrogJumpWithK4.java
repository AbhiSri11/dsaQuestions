package com.DP;

public class FrogJumpWithK4 {
    public static void main(String[] args) {
        int n=7;
        int k = 3;
        int[] arr = {10,20,30,10,30,20,40};
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0) {
                    int p = Math.abs(arr[i] - arr[i - j]) + dp[i-j];
                    min = Math.min(min,p);
                }
            }
            dp[i] = min;
        }
        System.out.println(dp[n-1]);


//        int n=7;
//        int[] arr = {10,20,30,10,30,20,40};
//        int[] dp = new int[n];
//        for(int i=0;i<n;i++) dp[i] = -1;
//        frog(n-1,3, arr,dp);
//        System.out.println(dp[n-1]);
//    }
//    public static int frog(int i,int k, int[]arr, int[]dp){
//        if(i==0){
//            dp[i]=0;
//            return 0;
//        }
//        if(dp[i]!=-1) return dp[i];
//        int min = Integer.MAX_VALUE;
//        for(int j=1;j<=k;j++) {
//            if (i - j >= 0) {
//                int p = frog(i-j,k,arr,dp) + Math.abs(arr[i]-arr[i-j]);
//                min = Math.min(min,p);
//            }
//        }
//        return dp[i] = min;
    }
}

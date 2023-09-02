package com.DP;

public class ClimbingStairs2 {
    //tabulation
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) dp[i] = dp[i-1]+dp[i-2];
        System.out.println(dp[n]);

    //memoization
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = new int[n+1];
//         for(int i=0;i<=n;i++) arr[i] = -1;
//         fac(n,arr);
//        System.out.println(arr[n]);
//    }
//     public static int fac(int n, int[] arr){
//         if(n<=1) {
//             arr[n] =1;
//             return 1;
//         }
//         if(arr[n]!=-1) return arr[n];
//         return arr[n] = fac(n-1,arr) + fac(n-2,arr);
    }
}

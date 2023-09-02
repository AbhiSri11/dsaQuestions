package com.DP;

public class UniquePath8 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0] = 1;
        for(int j=0;j<n;j++) dp[0][j] = 1;
        for(int i=1;i<m;i++){
            for(int j =1;j<n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }

    //memorization
//    public static void main(String[] args) {
//        int m = 3;
//        int n = 7;
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j] = -1;
//            }
//        }
//        System.out.println(path(m-1,n-1,dp));
//    }
//    public static int path(int m,int n,int[][] dp){
//        if(m==0 && n==0) {
//            return 1;
//        }
//        if(m<0 || n<0) return 0;
//        if(dp[m][n]!=-1) return dp[m][n];
//        int left = path(m-1,n,dp);
//        int right = path(m,n-1,dp);
//        return dp[m][n] = left + right;
//    }
}

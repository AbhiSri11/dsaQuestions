package com.DP;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        Integer dp[][]=new Integer[n][n];
        for(int i=0;i<matrix.length;i++){
            min = Math.min(min,path(0,i,matrix,dp,n));
        }
        System.out.println(min);
    }
    public static int path(int i, int j, int[][] matrix, Integer [][] dp,int n){
        if(i>n-1 || j<0 || j>n-1) return 88888;
        if(i==n-1) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int left = matrix[i][j] + path(i+1,j-1,matrix,dp,n);
        int right = matrix[i][j] + path(i+1,j,matrix,dp,n);
        int down = matrix[i][j] + path(i+1,j+1,matrix,dp,n);
        return dp[i][j] = Math.min(Math.min(left,right),down);
    }
}

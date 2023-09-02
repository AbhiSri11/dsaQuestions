package com.DP;

public class MinimumPathSum10 {
    public static void main(String[] args) {
        //int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = {{1,2,3},{4,5,6}};
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(path(grid.length-1,grid[0].length-1,grid,dp));
    }
    public static int path(int i, int j, int[][]grid,int[][] dp){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return 88888;
        if(dp[i][j]!=-1) return dp[i][j];
        int left = grid[i][j] + path(i-1,j,grid,dp);
        int right = grid[i][j] + path(i,j-1,grid,dp);
        return dp[i][j] = Math.min(left , right);
    }
}

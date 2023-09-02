package com.codeforcesShivansh.No;
import java.util.*;
public class Minimum_path_sum {
    public static void main(String args[]){
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(minPath(0,0,grid,dp));
    }
    public static int minPath(int i,int j,int[][]grid,int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(i+1<=grid.length-1){
            down=grid[i][j]+minPath(i+1,j,grid,dp);
        }
        if(j+1<=grid[0].length-1){
            right=grid[i][j]+minPath(i,j+1,grid,dp);
        }
        return dp[i][j]=Math.min(down,right);
    }
}

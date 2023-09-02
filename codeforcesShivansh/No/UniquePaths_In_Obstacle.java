package com.codeforcesShivansh.No;
import java.util.*;
public class UniquePaths_In_Obstacle {
    public static void main(String args[]){
        int[][] mat={{0,0,0},{0,1,0},{0,0,0}};
        int[][] dp=new int[mat.length][mat[0].length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(No_Unique(0,0,mat,dp));
    }
    public static int No_Unique(int i,int j,int[][] mat,int[][] dp){
        if(i==mat.length-1 && j==mat[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=0;
        int right=0;
        if(i+1<=mat.length-1 && mat[i+1][j]==0){
            down=No_Unique(i+1,j,mat,dp);
        }
        if(j+1<=mat[0].length-1 && mat[i][j+1]==0){
            right=No_Unique(i,j+1,mat,dp);
        }
        return dp[i][j]=down+right;
    }
}

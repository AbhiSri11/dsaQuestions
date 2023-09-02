package com.codeforcesShivansh;
import java.util.*;
public class Knapsack2 {
    public static void main(String args[]){
        int []val={1,6,0};
        int weight[]={4,5,1};
        int W=5;
        int [][] dp=new int [weight.length][W+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(knapsack2(weight.length-1,5,val,weight,dp));
    }
    public static int knapsack2(int i,int W,int[] val,int[] weight,int [][]dp){
        if(i==0){
            if(weight[i]<=W){
                return val[i];
            }else{
                return 0;
            }
        }
        if(dp[i][W]!=-1) return dp[i][W];
        int non_pick=0+knapsack2(i-1,W,val,weight,dp);
        int pick=Integer.MIN_VALUE;
        if(weight[i]<=W){
            pick=val[i]+knapsack2(i-1,W-weight[i],val,weight,dp);
        }
        return dp[i][W]=Math.max(pick,non_pick);
    }
}


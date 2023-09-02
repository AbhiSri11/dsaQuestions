package com.codeforcesShivansh;
import java .util.*;
public class Coinchange {
 public static void main(String args[]){
     //You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
     //
     //Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     //
     //You may assume that you have an infinite number of each kind of coin.
     int coins[]={1,2,5};
     int amount=11;
     int[][] dp=new int[coins.length][amount+1];
     for(int []row:dp){
         Arrays.fill(row,-1);
     }
     System.out.println(call(coins.length-1,amount,coins,dp));
 }
    public static int call(int i,int target,int[] coins,int[][] dp){
        if(target==0) return 0;
        if(i==0){
            if(target%coins[i]==0){
                return target/coins[i];
            }
            return Integer.MAX_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int not_take=call(i-1,target,coins,dp);
        int take=Integer.MAX_VALUE;;
        if(coins[i]<=target){
            take=call(i,target-coins[i],coins,dp);
            if(take!=Integer.MAX_VALUE) take=1+take;
        }

        return dp[i][target]=Math.min(take,not_take);
    }

}

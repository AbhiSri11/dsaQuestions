package com.codeforcesShivansh;

public class Coinchange2 {
    public static void main(String args[]){
        int coins[]={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
        }
        for(int target=0;target<=amount;target++){
            if(target%coins[0]==0){
                dp[0][target]=target/coins[0];
            }else{
                dp[0][target]=Integer.MAX_VALUE;
            }
        }
        for(int i=1;i<coins.length;i++){
            for(int target=1;target<=amount;target++){
                int not_take=0+dp[i-1][target];
                int take=Integer.MAX_VALUE;
                if(coins[i]<=target){
                    take=dp[i][target-coins[i]];
                    if(take!=Integer.MAX_VALUE) take=take+1;
                }
                dp[i][target]=Math.min(not_take,take);
            }
        }
        if(dp[coins.length-1][amount]==Integer.MAX_VALUE) return -1;
        return dp[coins.length-1][amount];
    }
}

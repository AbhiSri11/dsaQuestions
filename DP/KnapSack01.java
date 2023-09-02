package com.DP;

public class KnapSack01 {
    public static void main(String[] args) {
        int w = 4;
        int val[] = {1,2,3};
        int wt[] = {4,5,1};
        int[][] dp = new int[wt.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(sack(0,w,wt,val,dp));
    }
    static int sack(int i,int w, int[] wt, int[] val,int[][] dp){
        if(w<0) return -10000;
        if(i>=val.length) return 0;
        if(dp[i][w]!=-1) return dp[i][w];
        int pick = val[i] + sack(i+1,w-wt[i],wt,val,dp);
        int nonPick = sack(i+1,w,wt,val,dp);
        return dp[i][w] = Math.max(pick,nonPick);
    }
}

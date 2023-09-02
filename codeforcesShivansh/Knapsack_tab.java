package com.codeforcesShivansh;

public class Knapsack_tab {
    public static void main(String args[]){
        int[] val={1,6,0};
        int[] wt={4,5,1};
        int W=5;
        int dp[][]=new int[wt.length][W+1];

        // the weight of the element should be less than the capacity of the knapsack.  So we started the loop from wt[0] to W(capacity of thw knapsack).
        for(int i=wt[0];i<=W;i++){
            dp[0][i]=val[0];
        }
        for(int i=1;i<wt.length;i++){
            for(int weight=0;weight<=W;weight++){
                int not_take=0+dp[i-1][weight];
                int take=Integer.MIN_VALUE;
                if(wt[i]<=weight){
                    take=val[i]+dp[i-1][weight-wt[i]];
                }
                dp[i][weight]=Math.max(not_take,take);
            }
        }
        System.out.println(dp[wt.length-1][W]);

    }
}

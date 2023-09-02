package com.codeforcesShivansh;

public class Knapsack {
    public static void main(String args[]){
        int []val={1,2,3};
        int weight[]={4,5,1};
        System.out.println(knapsack(0,0,4,val,weight));
    }
    public static int knapsack(int i,int v,int W,int[] val,int[] weight){
        if(W<=0 || i==weight.length){
            return v;
        }
        int pick=knapsack(i+1,v+val[i],W-weight[i],val,weight);
        int non_pick=knapsack(i+1,v,W,val,weight);

        return Math.max(pick,non_pick);
    }
}

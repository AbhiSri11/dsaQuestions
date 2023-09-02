package com.codeforcesShivansh;

public class Unbounded_knapsack {
    public static void main(String args[]){
        int [] val={1,1};
        int [] wt={2,1};
        System.out.println(knapSack(3,val,wt));
    }
    public static int knapSack(int W, int val[], int wt[])
    {
        return call(wt.length-1,W,wt,val);
    }
    public static int call(int i,int W,int[] wt,int[] val){
        if(W==0) return 0;
        if(i==0){
            if(wt[i]<=W) return val[i]*W/wt[i];
        }
        int not_take=call(i-1,W,wt,val);
        int take=Integer.MIN_VALUE;
        if(wt[i]<=W){
            take=val[i]+call(i,W-wt[i],wt,val);
        }
        return Math.max(take,not_take);
    }
}

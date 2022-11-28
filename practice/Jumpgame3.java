package com.practice;

import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext;

public class Jumpgame3 {
    public static void main(String[] args) {
        int[] arr={1,-1,-2,4,-7,3};
        int k=2;
        maxResult(arr,k);

    }
    public static int maxResult(int[] nums, int k) {
        int sum[]=new int[1];
        call(0,nums,k,sum,0);
        return sum[0];
    }
    public static void call(int ind,int[] nums,int k,int [] sum,int s){
        if(ind==nums.length-1){
            if(sum[0]<s) sum[0]=s;
            return;
        }
        for(int i=1;i<=k;i++){
            call(ind+i,nums,k,sum,s+nums[ind]);
        }
    }
}

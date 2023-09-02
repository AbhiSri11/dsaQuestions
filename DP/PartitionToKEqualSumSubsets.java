package com.DP;

import java.util.ArrayList;

public class PartitionToKEqualSumSubsets {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3,4,5};
        int k = 4;
        int sum = 0;
        for(int i=0;i<nums.length;i++) sum += nums[i];
        if(sum % k !=0) System.out.println("it is false 1");
        sum = sum/k;
        for(int i=0;i<k;i++){
            ArrayList<Integer> list = new ArrayList<>();
            boolean can = sum(i,sum,nums,list);
            if(!can) System.out.println("it is false 2");
            for(int j=0;j<list.size();j++){
                for(int p=0;p<nums.length;p++){
                    if(list.get(i)==nums[p]){
                        nums[p] = Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
        System.out.println("it is true");
    }
    public static boolean sum(int i,int sum,int[] nums,ArrayList<Integer> list){
        if(sum == 0) return true;
        if(i>=nums.length || sum<0) return false;
        list.add(nums[i]);
        boolean take = sum(i+1,sum-nums[i],nums,list);
        list.remove(list.size()-1);
        boolean notTake = sum(i+1,sum,nums,list);
        return take || notTake;
    }
}

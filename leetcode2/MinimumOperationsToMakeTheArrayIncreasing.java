package com.leetcode2;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,1};
        int ans  = minOperations(nums);
        System.out.println(ans);
    }
    static int minOperations(int[] nums) {
        int count =0;
        for(int i=1;i<nums.length;i++){
            int temp =0;
            if(nums[i]<=nums[i-1]){
                temp = nums[i-1]-nums[i];
                count = count + temp + 1;
                nums[i]=nums[i]+temp+1;
            }

        }
        return count;
    }
}

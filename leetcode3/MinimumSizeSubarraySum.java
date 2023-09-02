package com.leetcode3;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target,arr);
        System.out.println(ans);
    }
    static int minSubArrayLen(int target, int[] nums) {
        int sum =0;
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length && i<nums.length){
            while(j<nums.length && sum<target){
                sum = sum+nums[j];
                j++;
            }
            while(sum>=target && i<nums.length){
                min = Math.min(min,j-i);
                sum = sum-nums[i];
                i++;
            }
        }
        if(j==nums.length && i==0){
            return 0;
        }
        return min;
    }
}

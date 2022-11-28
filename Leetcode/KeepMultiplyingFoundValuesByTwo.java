package com.Leetcode;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] arr ={8,19,4,2,15,3};
        int target =2;
        int ans = findFinalValue(arr,target);
        System.out.println(ans);
    }
    static int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original = 2* original;
                i=-1;
            }
        }
        return original;
    }
}

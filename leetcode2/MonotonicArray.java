package com.leetcode2;

import java.util.Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int [] ans = {6,5,4,4};
        boolean arr = isMonotonic(ans);
        System.out.println(arr);
    }
    static boolean isMonotonic(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        if(arr[0]<=arr[nums.length-1]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=arr[i])
                    return false;
            }
            return true;
        }
        else{
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=arr[nums.length-1-i])
                    return false;
            }
        }
        return true;
    }
}

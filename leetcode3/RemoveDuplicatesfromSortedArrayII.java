package com.leetcode3;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,2,2,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int i=1;
        int j=1;
        int p=1;
        int count = 1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(nums[i]!=nums[i-1]){
                    count = 0;
                }
                count++;
                if(count<=2){
                    i++;
                    p++;
                }
            }
            else{
                count=1;
                nums[p] = nums[j];
                p++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}

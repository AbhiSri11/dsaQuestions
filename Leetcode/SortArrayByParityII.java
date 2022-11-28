package com.Leetcode;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums={4,2,5,7};
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i=i+2;
                j=j+2;
            }
            if(i>=nums.length && j>=nums.length)
                break;
            if(nums[i]%2==0)
                i=i+2;
            if(nums[j]%2!=0)
                j=j+2;
//            if(i>=nums.length && j>=nums.length)
//                break;

        }
        System.out.println(Arrays.toString(nums));
    }
}

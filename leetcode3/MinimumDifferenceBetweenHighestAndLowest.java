package com.leetcode3;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowest {
    public static void main(String[] args) {
        int[] nums = {87063,61094,44530,21297,95857,93551,9918};
        int k=5;
        if(nums.length==1){
            System.out.println("0");
        }
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;;
        while(i<nums.length){
            if(i<k){
                i++;
            }
            else{
                int count = nums[i]-nums[j];
                if(min>count){
                    min = count;
                }
                i++;
                j++;
            }
        }
        System.out.println(min);
    }
}

package com.leetcode4;

import java.util.HashMap;
import java.util.HashSet;

public class Q2461 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,7,8,9};
        int k=3;
        int sum =0;
        HashSet<Integer> hash = new HashSet<>();
        int max = 0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(hash.size()<k){
                if(hash.contains(nums[j])){
                    while(hash.contains(nums[j])){
                        hash.remove(nums[i]);
                        sum-=nums[i++];
                    }
                }
                sum += nums[j];
                hash.add(nums[j]);
                j++;
            }
            if(hash.size()==k){
                if(sum>max){
                    max = sum;
                }
                hash.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        System.out.println(max);
    }
}

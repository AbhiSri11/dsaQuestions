package com.leetcode4;

import java.util.*;

public class Q287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                if(nums[nums[i]]==i) System.out.println(nums[i]);
                swap(nums[i],i,nums);
            }
        }
        System.out.println(nums[0]);





//        HashSet<Integer> hash = new HashSet<>();
//        int i=0;
//        while(i<nums.length){
//            if(hash.contains(nums[i])) {
//                System.out.println(nums[i]);
//                break;
//            }
//            hash.add(nums[i]);
//            i++;
//        }

    }
    public static void swap(int i,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

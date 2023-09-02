package com.leetcode3;

import java.util.HashSet;

public class MinimumConsecutiveCardsToPickUp {
    public static void main(String[] args) {
        int[] nums = {3,4,2,3,4,7};
        int min = Integer.MAX_VALUE;
        HashSet<Integer> hash = new HashSet<>();
        int i=1,j=0;
        int size =2;
        hash.add(nums[0]);
        while(i<nums.length){
            if(hash.contains(nums[i])){
                while(j<i){
                    hash.remove(nums[j]);
                    j++;
                    size--;
                    if(nums[j]==nums[i]){
                        break;
                    }
                }
                if(min<size){
                    min = size;
                }
            }
            else{
                hash.add(nums[i]);
                size++;
            }
            i++;
        }
        if(min!=Integer.MAX_VALUE){
            System.out.println(min);
        }
        System.out.println(-1);
    }
}

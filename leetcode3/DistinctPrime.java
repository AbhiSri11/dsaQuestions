package com.leetcode3;

import java.util.HashSet;

public class DistinctPrime {
    public static void main(String[] args) {
        int[] nums = {2,4,3,7,10,6};
        System.out.println(distinctPrimeFactors(nums));
    }
    static int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        long p = 1;
        for(int i=0;i<nums.length;i++){
            p = p*nums[i];
        }
        int j=2;
        while(p>1){
            if(p%j==0){
                p=p/j;
                hash.add(j);
            }
            else{
                j++;
            }
        }
        return hash.size();
    }
}

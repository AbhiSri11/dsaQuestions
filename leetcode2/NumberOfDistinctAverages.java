package com.leetcode2;
import java.util.*;
public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] arr = {4,1,4,0,3,5,6,4,7,8,9,9};
        int count = distinctAverages(arr);
        System.out.println(count);
    }
    static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length/2;i++){
            int avg= (nums[i]+nums[nums.length-1-i])/2;
            if(hash.contains(avg))
                continue;
            hash.add(avg);
        }
        return hash.size();
    }
}

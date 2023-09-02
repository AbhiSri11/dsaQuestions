package com.leetcode3;

import java.util.*;

public class LongestSquareStreakInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,6,7,8,5,3,3,4,5};
        System.out.println(longestSquareStreak(arr));
    }
    static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[0];
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max1 = nums[i];
            }
            hash.add(nums[i]);
        }
        int ans = 1;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            long p = (long)nums[i]*nums[i];
            int t = Integer.MAX_VALUE;
            while(p<=t && hash.contains((int)p)){
                ans++;
                if(max<ans){
                    max = ans;
                }
                hash.remove(p);
                p = p*p;
            }
            ans = 1;
        }
        if(max==0){
            return -1;
        }
        return max;
    }
}

package com.leetcode2;

import java.util.Arrays;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums = {2,10000,10000,10000,2};
        int ans=mostFrequentEven(nums);
        System.out.println(ans);
    }
    static int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        // // int v=0;
        // // for(int i=0;i<nums.length;i++){
        // //    if(nums[i]%2==0)
        // //         v++;
        // // }
        // if(v==0)
        //     return -1;
        int max = -1;
        int c = 1;
        int i = 1;
        int g = -1;
        while (i < nums.length) {
            if (c > max) {
                max = c;
                g = nums[i-1];
                //v=i;
            }
            if (nums[i] % 2 == 0 && nums[i] == nums[i - 1]) {
                c++;
                i++;
            } else {
                c = 1;
                i++;
            }
        }
        if(max==1) return -1;
        return g;
    }
}

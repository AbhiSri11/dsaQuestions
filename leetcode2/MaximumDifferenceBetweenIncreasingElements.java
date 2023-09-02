package com.leetcode2;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums={917,907,907,881};
        int ans =maximumDifference(nums);
        System.out.println(ans);
    }
    static int maximumDifference(int[] nums) {
        int max =-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp = nums[j]-nums[i];
                if(max<temp)
                    max= temp;
            }
        }
        return max;
    }
}

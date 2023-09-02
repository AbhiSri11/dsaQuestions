package com.leetcode4;
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        Arrays.sort(nums);
        System.out.println(threeSumClosest(nums,1));
    }
    static int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    ans = sum;
                    minDiff = diff;
                }
                if (sum > target) k--;
                else j++;
            }
        }
        return ans;
    }
}

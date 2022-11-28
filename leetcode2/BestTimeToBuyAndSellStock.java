package com.leetcode2;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int ans =maxProfit(nums);
        System.out.println(ans);
    }
    static int maxProfit(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp = nums[i]-nums[j];
                if(temp>ans)
                    ans= temp;
            }
        }
        return ans;
    }
}

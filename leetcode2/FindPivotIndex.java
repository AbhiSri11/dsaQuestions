package com.leetcode2;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int ans =pivotIndex(nums);
        System.out.println(ans);
    }
    static int pivotIndex(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum-nums[0]==0)
            return 0;
        if(sum-nums[nums.length-1]==0)
            return nums.length-1;
        int i=1;
        int j= nums.length-2;
        int ans = nums[0];
        int ans2 =nums[nums.length-1];
        while(j-i>1){
            if(ans2>ans){
                ans = ans+nums[i];
                i++;
            }
            else{
                ans2 = ans2+nums[j];
                j--;
            }
        }
        if(ans == ans2)
            return ++i;
        else
            return -1;
    }
}

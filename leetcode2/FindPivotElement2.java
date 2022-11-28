package com.leetcode2;

public class FindPivotElement2 {
    public static void main(String[] args) {
        int [] nums = {2,1,-1};
        int ans=pivotIndex(nums);
        System.out.println(ans);
    }
    static int pivotIndex(int[] nums) {
        int first=0;
        int last=0;
        int i=0;
        int j=nums.length-1;
        if(nums[i]>nums[j])

        while(i<=j){
            if(i==j){
                if(first==last)
                    return i;
            }
            if(first<=last){
                first=first+nums[i];
                i++;
            }
            else{
                last=last+nums[j];
                j--;
            }
        }
        return -1;
    }
}

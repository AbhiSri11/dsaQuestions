package com.Leetcode;
///////////Nhi hua/////////////
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr = {1,2,10,5,7};
        boolean ans = canBeIncreasing(arr);
        System.out.println(ans);
    }
    static boolean canBeIncreasing(int[] nums) {
        int count=0;
        int i=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
            if(nums[i]<nums[i-1] && nums[i-2]>nums[i])
                return false;
        }

        if(count>1)
            return false;
        return true;
    }
}

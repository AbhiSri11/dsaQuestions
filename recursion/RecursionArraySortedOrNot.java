package com.recursion;

public class RecursionArraySortedOrNot {
    public static void main(String[] args) {
        int[] nums ={1,2,3,45,5};
        boolean ans = main(nums);
        System.out.println(ans);
    }
    static boolean main(int[] nums){
        return helper(nums , 0);
    }
    static boolean helper(int[] nums, int i){
        if(i==nums.length-1)
            return true;
        if(nums[i]<nums[i+1])
            return helper(nums,++i);
        else
            return false;
    }
}

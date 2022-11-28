package com.leetcode2;
// NHI HUA HAI
public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        boolean ans = check(nums);
        System.out.println(ans);
    }
    static boolean check(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int mid=0;
        while(start<end){
            mid= start+(end-start)/2;
            if(nums[0]<=nums[mid])
                start = mid+1;
            else
                end =mid;
        }
        for(int i = 1 ;i< end;i++){
            if(nums[i]<nums[i-1])
                return false;
        }
        for(int i=end+1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
                return false;
        }
        return true;
    }
}

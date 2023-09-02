package com.leetcode;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3};
        int ans=singleNonDuplicate(arr);
        System.out.println(ans);

    }
    static int singleNonDuplicate(int[] nums) {
        int start =0;
        int end=nums.length-1;
        int mid =0;
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                if((nums.length-1-mid)%2==0)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else{
                if((nums.length-1-mid)%2==0){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
        }
        return nums[start];
    }
}

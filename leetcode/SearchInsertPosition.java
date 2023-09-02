package com.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target =5;
        int ans=main(arr,target);
        System.out.println(ans);

    }
    static int main(int [] nums, int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            if(target==nums[mid])
                return mid;
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return end+1;
    }
}

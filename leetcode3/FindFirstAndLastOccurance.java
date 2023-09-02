package com.leetcode3;

import java.util.Arrays;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(Arrays.toString(searchRange(arr,2)));
    }
    static int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        int st = 0;
        int end = nums.length-1;
        int mid = 0;
        while(st<end){
            mid = st+(end-st)/2;
            if(target == nums[mid]){
                arr[0] = mid;
                end = mid;
            }
            else if(nums[mid]<target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        st = 0;
        end = nums.length-1;
        mid = 0;
        while(st<=end){
            mid = st+(end-st)/2;
            if(target == nums[mid]){
                arr[1] = mid;
                st = mid+1;
            }
            else if(nums[mid]<target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return arr;
    }
}

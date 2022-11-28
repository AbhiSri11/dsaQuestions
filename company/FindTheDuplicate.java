package com.company;

import java.util.List;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[]arr ={3,3,1,4,2};
        int ans =cyclic(arr);
        System.out.println(ans);
    }
    static int cyclic(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else
                i++;
        }
        return nums[nums.length-1];
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}

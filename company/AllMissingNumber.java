package com.company;

import java.util.*;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> ans = new ArrayList<>();
        ans = cyclic(arr);
        System.out.println(ans);
    }

    static List<Integer> cyclic(int[] nums) {
        int i = 0;
       int n=nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }
            else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if (nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
      }
      static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
      }
}
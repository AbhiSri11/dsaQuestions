package com.company;
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[]arr ={1};
       int ans = first(arr);
        System.out.println(ans);
    }
   static int first(int[] nums){
    int i=0;
    while( i<nums.length){
        if(nums[i]>0 && nums[i]<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else
                i++;
        }
        else
            i++;
    }
    for(int j=0;j< nums.length;j++){
        if(nums[j]!=j+1)
            return j+1;
    }
    return nums.length +1;
}
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
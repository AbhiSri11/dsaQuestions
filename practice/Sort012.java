package com.practice;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        int i=0;
        int j=nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                swap(k,i++,nums);
            }
            if(nums[k]==2){
                swap(k,j--,nums);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

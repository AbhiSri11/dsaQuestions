package com.leetcode;
import java.util.*;
public class SortColour {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
//        int i=0;
//        int j=0;
//        int k=0;
//        for(int p=0;p<nums.length;p++){
//            if(nums[p]==0)
//                i++;
//            else if(nums[p]==1)
//                j++;
//            else
//                k++;
//        }
        int l=0;
        for(int p=0;p<nums.length;p++) {
            if(nums[p]==0){
                int temp = nums[l];
                nums[l]=nums[p];
                nums[p]=temp;
                l++;
            }
        }
        for(int p=l;p<nums.length;p++){
             if(nums[p]==1){
                int temp=nums[l];
                nums[l]=nums[p];
                nums[p]=temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

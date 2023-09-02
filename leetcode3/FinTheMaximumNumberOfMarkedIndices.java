package com.leetcode3;
import java.util.*;
public class FinTheMaximumNumberOfMarkedIndices {
    public static void main(String[] args) {
        int[] arr = {42,83,48,10,24,55,9,100,10,17,17,99,51,32,16,98,99,31,28,68,71,14,64,29,15,40};
        System.out.println(maxNumOfMarkedIndices(arr));
    }
    static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int ans = 0;
        while(j<nums.length){
            if(nums[j]>=nums[i]*2){
                ans = ans+2;
                nums[j]=nums[nums.length-1];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}

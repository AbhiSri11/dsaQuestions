package com.leetcode3;

import java.util.Arrays;

public class TheKStrongestValues {
    public static void main(String[] args) {
        int[] arr = {-7,22,17,3};
        int k=2;
        Arrays.sort(arr);
        int m = (arr.length)/2;
        int j = arr.length-1;
        int i=0;
        int p=0;
        int[] nums = new int[k];
        while((j>=0 && i<arr.length) && p<k){
            int x = Math.abs(arr[j]-arr[m]);
            int y = Math.abs(arr[m]-arr[i]);
            if(x >= y){
                nums[p] = arr[j];
                j--;
                p++;
            }
            else{
                nums[p] = arr[i];
                i++;
                p++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

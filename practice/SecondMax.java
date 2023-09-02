package com.practice;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {3,4,9,5,105,-5,3,2,1};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;;
        int j=0;
        while(j<nums.length) {
            if (max < nums[j]) {
                secmax = max;
                max = nums[j];
            }
            j++;
        }
        System.out.println(max + " " + secmax);
    }
}

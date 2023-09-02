package com.leetcode3;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums= {5,7,1,8};
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                nums[i-1] = nums[i];
                count++;
                i=0;
            }
            if(count>=2){
                System.out.println("false");
                break;
            }

        }
        System.out.println("true");
    }
}

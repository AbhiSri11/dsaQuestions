package com.practice2;

public class KadaneWithN {
    public static void main(String[] args) {
        int[] nums = {95,4,-1,7,8,4,3,2,-2,-6,-9,6,-4,-3,-33,3,4,6,7};
        int sum = 0;
        int max =Integer.MIN_VALUE;
        int i =0;
        while(i<nums.length){
            sum = sum + nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
            i++;
        }
        System.out.println(max);
    }
}

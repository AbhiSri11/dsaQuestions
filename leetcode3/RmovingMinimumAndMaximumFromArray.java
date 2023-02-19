package com.leetcode3;

public class RmovingMinimumAndMaximumFromArray {
    public static void main(String[] args) {
        int[] nums = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
    static int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minInd=0;
        int maxInd=0;
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                maxInd = i;
                max = nums[i];
            }
            if(nums[i]<min){
                minInd = i;
                min = nums[i];
            }
        }
        if(minInd == maxInd){
            return 1;
        }
        max = Math.max(minInd,maxInd);
        min = Math.min(minInd,maxInd);
        System.out.println();
        int x = n-min;
        int y = max+1;
        int z = n-max+min+1;
        return ((x < y && x < z)? x: (y < z)?y:z);
    }
}

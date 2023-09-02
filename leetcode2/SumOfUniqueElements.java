package com.leetcode2;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums ={1,1,1,1,1};
        int ans = sumOfUnique(nums);
        System.out.println(ans);
     }
     static int sumOfUnique(int[] nums) {
         int max = nums[0];
         int sum = 0;
         for(int i=1;i<nums.length;i++){
             max = Math.max(max,nums[i]);
         }
         int[] count = new int[max+1];
         for(int i=0;i<nums.length;i++){
             count[nums[i]-1]++;
         }
         for(int i=0;i<count.length;i++){
             if(count[i]==1)
                 sum = sum+i+1;
         }
         return sum;
     }
}

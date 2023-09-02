package com.leetcode4;

import java.util.Arrays;

public class Q2644 {
    public static void main(String[] args) {
        int[] nums = {73,13,20,6};
        int[] divisor = {56,75,83,26,24,53,56,61};
        int ans = maxDivScore(nums,divisor);
        System.out.println(ans);
    }
    static int maxDivScore(int[] nums, int[] divisors) {
        int[][] arr = new int[divisors.length][2];
        int ans = 0;
        for(int i=0;i<divisors.length;i++){
            int sum =0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0) ans++;
            }
            arr[i][0]= divisors[i];
            arr[i][1]=ans;
        }
        Arrays.sort(arr,(a, b)->(a[1]-b[1]));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][1]);
        }
        int maz = arr[arr.length-1][1];
        for(int j=arr.length-1;j>0;j--){
            if(arr[j][1]==arr[j-1][1]) maz = arr[j-1][0];
            else break;
        }
        return maz;
    }
}

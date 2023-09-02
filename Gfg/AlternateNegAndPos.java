package com.Gfg;

public class AlternateNegAndPos {
    public static void main(String[] args) {
        int [] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int[] nums = new int[arr.length];
        int i=0;
        int j=0;
        int k=0;
        while(k<nums.length){
            while(i<arr.length && arr[i]<0) i++;

            if(i<arr.length && arr[i]>=0) nums[k++]=arr[i++];
            if(k==nums.length) break;
            while(j<arr.length && arr[j]>=0) j++;

            if(j<arr.length && arr[j]<0) nums[k++]=arr[j++];
        }
        for(int p=0;p<nums.length;p++) System.out.println(nums[p]);
    }
}

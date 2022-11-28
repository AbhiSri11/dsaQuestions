package com.Leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2={1};
        int m=0;
        int n=1;
        merge(nums1,m,nums2,n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-1;
        int i=m-1;
        int h=n-1;
        while(i>=0 && h>=0){
            if(nums1[i]>=nums2[h]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]=nums2[h];
                h--;
                k--;
            }
        }
        if(i>=0){
            for(;i>=0;i--){
                nums1[k]=nums1[i];
                k--;
            }
        }
        if(h>=0){
            for(;h>=0;h--){
                nums1[k]=nums1[h];
                k--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

}

package com.Leetcode;
import java.util.*;
public class IntersectionOf2Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = new int[1000];
        ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int c=0;
        int[] arr = new int[1000];
        while(i<nums1.length || j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr[c]=nums1[i];
                c++;
                if(i<nums1.length)
                    i++;
                if(j<nums2.length)
                    j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else
                i++;
        }
        int[] arr2 = new int[c];
        for(int p=0;p<c;p++)
            arr2[i]=arr[i];
        return arr2;
    }
}

package com.Leetcode;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr2 = {1};
        double ans = findMedianSortedArrays(arr,arr2);
        System.out.println(ans);

    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
                k++;
            } else {
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }
        if (i < nums1.length) {
            while (i != nums1.length) {
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }
        if (j < nums2.length) {
            while (j != nums2.length) {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        int p = nums1.length + nums2.length;
        if (p % 2 == 0) {
            int a = arr[p/2];
            int b= arr[p/2-1];
            double med = (double)(a+b)/2;
            return med;
        }
        return (double) arr[(m + n) / 2];
    }
}

package com.company;

import java.util.Arrays;

public class FirstAndLastOccur {
    public static void main(String[] args) {
        int [] arr ={};
        int target = 0;
        int[] ans = arra(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] arra(int[] arr, int target){
        int ans = first(arr,target);
        int ans2 = last(arr,target);
        int[] nums ={ans,ans2};
        return nums;
    }
    static int first(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(arr[mid]==target)
                end =mid-1;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end=mid-1;
        }
        if(arr[start]==target)
        return start;
        else
            return -1;
    }
    static int last(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(arr[mid]==target)
                start = mid+1;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end=mid-1;
        }
        if(arr[end]==target)
            return end;
        else
            return -1;
    }
}
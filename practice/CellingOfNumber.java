package com.practice;

public class CellingOfNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = celling(arr,target);
        System.out.println(ans);
    }
    static int celling(int [] arr , int target){
        int start =0;
        int end = arr.length-1;
        int mid =0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return start;
    }
}

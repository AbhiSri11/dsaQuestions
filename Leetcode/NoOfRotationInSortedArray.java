package com.Leetcode;

public class NoOfRotationInSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        //int [] arr={1};
        int ans = main(arr);
        System.out.println(ans);
    }
    static int main(int[]arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[start]>arr[mid])
                end=mid;
            else
                start = mid+1;
        }
        return end;
    }
}

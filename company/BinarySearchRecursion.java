package com.company;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int start = 0;
        int end=arr.length-1;
        int ans = bs(arr,target,start,end);
        System.out.println(ans);
    }
    static int bs(int[]arr, int target, int start, int end){
        if(start>end)
        return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]<target)
            return bs(arr,target,mid+1,end);
        else
            return bs(arr,target,start,mid-1);
    }
}

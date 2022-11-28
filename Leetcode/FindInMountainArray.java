package com.Leetcode;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,3,2};
        int target = 6;
        int ans = main(arr,target);
        System.out.println(ans);
    }
    static int main(int [] arr, int target){
        int start =0;
        int end =arr.length-1;
        int mid=0;
        while(start<end){
            mid=start + (end-start)/2;
            if(arr[mid]<arr[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        int peak = end;
        int ans = ascending(arr,peak,target);
        int ans2 = decending(arr,peak,target);
        if(ans==-1 && ans2==-1)
            return -1;
        else if (ans==-1)
            return ans2;
        else
            return ans;
    }
    static int ascending(int [] arr,int peak,int target){
        int start =0;
        int end=peak;
        int mid = 0;
        while(start<=end){
            mid=start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
    static int decending(int [] arr,int peak,int target){
        int start =peak+1;
        int end=arr.length-1;
        int mid = 0;
        while(start<=end){
            mid=start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}

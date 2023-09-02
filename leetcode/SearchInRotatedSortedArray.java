package com.leetcode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={1};
        int target=1;
        int ans = search(arr,target);
        System.out.println(ans);
    }
   static int search(int[] arr, int target) {
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

       int peak= end;
       if(target>=arr[0]){
           int ans = ascending(arr,peak,target);
           return ans;
       }
       else{
           int ans = decending(arr,peak,target);
           return ans;
       }
   }

    static int ascending(int [] arr,int peak,int target){
        int start =0;
        int end=peak-1;
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
        int start =peak;
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

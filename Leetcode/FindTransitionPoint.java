package com.Leetcode;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int [] arr = {0,0,0,0};
        int ans = transitionPoint(arr , 4);
        System.out.println(ans);
    }
   static int transitionPoint(int arr[], int n) {
        if(n==1 && arr[0]==0)
            return -1;
        if(n==1){
            return 0;
        }
        int start =0;
        int end = n-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end- start)/2;

            if(arr[mid] == 1){
                end = mid-1;
            }
            else
                start = mid+1;
        }
       if(start>=n)
           return -1;
        return start;
    }
}

package com.leetcode;

public class CountTheZeros {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,0,0,0};
        int n=12;
        int ans = countZeroes(arr,n);
        System.out.println(ans);
    }
    static int countZeroes(int[] arr, int n) {
        // code here
        int start =0;
        int end = n-1;
        int mid= 0;
        while(start<=end){
            mid=start +(end-start)/2;
            if(arr[mid]==1){
                start =mid+1;
            }
            else{
                end =mid -1;
            }
        }
        int ans= n-start;
        return ans;
    }
}

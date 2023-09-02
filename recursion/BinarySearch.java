package com.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,9,28};
        System.out.println(bs(0,7,4,arr));
    }
    static int bs(int st, int end,int tar,int[] arr){
        if(st>end){
            return -1;
        }
        int mid = (st+end)/2;
        if(arr[mid] == tar){
            return mid;
        }
        else if(arr[mid] > tar){
            return bs(st,mid-1,tar,arr);
        }
        return bs(mid+1,end,tar,arr);
    }
}

package com.practice2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,9,20};
        int tar = 91;
        int st = 0;
        int end = arr.length-1;
        int mid =0;
        while(st<=end){
            mid = st +(end-st)/2;
            if(arr[mid] == tar) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>tar){
                end = mid-1;
            }
            else st = mid + 1;
        }
    }
}

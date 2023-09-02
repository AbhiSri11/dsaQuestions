package com.company2;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,5,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int mid;
        int end = arr.length - 1;
        while(start<end){
            mid=start + (end-start)/2;
            if(arr[mid]<arr[mid+1])
                start = mid +1;
            else
                end = mid;
        }
        return end;
    }
}

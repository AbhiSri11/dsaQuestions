package com.practice2;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,10,10,10,10,10,10,10,18,20};
        int target = 10;
        int first = -1;
        int last = -1;
        int st = 0;
        int end = arr.length-1;
        int mid = 0;
        while(st<=end){
            mid = st+(end-st)/2;
            if(arr[mid]==target){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]>target) end = mid-1;
            else st = mid+1;
        }
        st = 0;
        end = arr.length-1;
        while(st<=end){
            mid = st+(end-st)/2;
            if(arr[mid]==target){
                last = mid;
                st = mid+1;
            }
            else if(arr[mid]>target) end = mid-1;
            else st = mid+1;
        }
        System.out.println(first);
        System.out.println(last);
    }
}

package com.leetcode3;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(search(arr,3));
    }
    static int search(int[] arr, int target) {
        if(arr.length==1 || arr[0]==target){
            if(arr[0]==target)
                return 0;
            else
                return -1;
        }
        int st =0;
        int end = arr.length-1;
        int mid = 0;
        int count = 0;
        while(st<end){
            mid = st+(end-st)/2;
            if(arr[st]<arr[mid])
                st = mid;
            else
                end = mid;
            count = mid;
        }
        if(target>arr[0]){
            st =0;
            end = count;
        }
        else{
            st = count+1;
            end = arr.length-1;
        }
        //System.out.println(count);
        while(st<=end){
            mid = (end+st)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                st = mid+1;
        }
        return -1;
    }
}

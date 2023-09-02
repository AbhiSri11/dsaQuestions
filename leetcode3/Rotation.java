package com.leetcode3;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = {3 ,4 ,5 ,6 ,7 ,8, 1};
        System.out.println(findKRotation(arr));
    }
    static int findKRotation(int arr[]) {
        // code here
        if(arr.length==1){
            return 0;
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
        if(arr[count] > arr[arr.length-1]){
            return 0;
        }
        return count+1;
    }
}

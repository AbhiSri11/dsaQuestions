package com.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        reverse(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr,int st,int end){
        if(st>=end) return;
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        reverse(arr,st+1,end-1);




//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        int[] arr={1,2,3,4,5,6};
//        reverse(arr,0);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void reverse(int[] arr, int i){
//        if(i>arr.length/2){
//            return;
//        }
//        int temp = arr[i];
//        arr[i] = arr[arr.length-1-i];
//        arr[arr.length-1-i] = temp;
//        reverse(arr,++i);
    }
}

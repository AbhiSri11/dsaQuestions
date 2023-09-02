package com.RecursionByStriver;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,6,9,7,7,5,6,6};
        bubble(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int n){
        if(n==0 || n==1) return;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubble(arr,n-1);
    }
}

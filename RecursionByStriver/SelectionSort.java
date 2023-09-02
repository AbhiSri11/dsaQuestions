package com.RecursionByStriver;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,6,9,7,7,5,6,6};
//        int[] arr= {2,1,4,3};
        selection(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int n){
        if(n==0 || n==1) return;
        int maxI = 0;
        int max = 0;
        for(int j=0;j<n;j++){
            if(max<arr[j]){
                maxI = j;
                max = arr[j];
            }
        }
        int temp = arr[maxI];
        arr[maxI] = arr[n-1];
        arr[n-1] = temp;
        selection(arr,n-1);
    }
}

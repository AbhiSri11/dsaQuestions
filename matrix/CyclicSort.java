package com.matrix;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,7,6,2,2,3,4};
        int i=0;
        while(i<arr.length){
            while(arr[i]!=i+1){
                if(arr[arr[i]-1] == arr[i]) break;
                swap(arr[i]-1,i,arr);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

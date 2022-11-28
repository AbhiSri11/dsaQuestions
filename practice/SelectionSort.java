package com.practice;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,1,-2,-3,0,8,9,76,5,4,3,2,5,6,8,-21,-3,-5};
        //int[] arr={1};
        int max=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            k=0;
            max = arr[0];
            for(int j=0;j<arr.length-i;j++) {
                //
                if (max<arr[j]){
                    max=arr[j];
                    k=j;
                }
            }
            int last =arr.length-i-1;
            int temp=arr[k];
            arr[k]=arr[last];
            arr[last]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

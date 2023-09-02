package com.Gfg;

import java.util.Arrays;

public class ThreeWayPartition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4};
        int a = 1;
        int b = 2;
        int i=0;
        int j=arr.length-1;
        int k=0;
        int[] nums = new int[arr.length];
        while(k<j){
            if(arr[k]<=a){
                int[] p = {arr[k++]};
                int[] q = {arr[i++]};
                swap(arr,p,q);
            }
            else if(arr[k]>=b){
                int[] p = {arr[k++]};
                int[] q = {arr[j--]};
                swap(arr,p,q);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int[] p, int[] q){
        int temp = arr[p[0]];
        arr[p[0]] = arr[q[0]];
        arr[q[0]] = temp;
    }
}

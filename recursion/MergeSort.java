package com.recursion;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,6,7,8,9,4,2,2,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1)
            return arr;
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int i=0;int j=0;int k=0;
        int[] arr2=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr2[k]=left[i];
                i++;
                k++;
            }
            else{
               arr2[k]= right[j];
               k++;
               j++;
            }
        }
        while(i<left.length){
           arr2[k]=left[i];
           i++;
           k++;
        }
        while(j<right.length){
            arr2[k]=right[j];
            j++;
            k++;
        }
        return arr2;
    }
}

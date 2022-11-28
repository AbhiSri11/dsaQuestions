package com.RecursionByStriver;
import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int i){
        if(arr.length/2<i){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        rev(arr,i+1);
    }
}

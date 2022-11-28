package com.practice;

import java.util.Arrays;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                //int k=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

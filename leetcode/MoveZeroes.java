package com.leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={1,0};
        int i=0;
        int j=1;
        while(i<arr.length-1){
            if(arr[i]!=0) {
                i++;
                if(j<arr.length-1)
                   j=i+1;
            }
            if(arr[j]==0)
                j++;
            if(j==arr.length)
                break;
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j=i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

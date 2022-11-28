package com.company;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
       int [] arr ={4,8,6,2,0,9,6,3,5,6,7};
        int n = arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

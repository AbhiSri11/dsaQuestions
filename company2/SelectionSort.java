package com.company2;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,1,0,-1,6};
        int[] ans= selection(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] selection(int[] arr){
        int n =arr.length-1;
       // System.out.println(n);
        for(int i=0;i<=n;i++){
            int c=0;
            int max =arr[0];
            for(int j=0;j<=n-i;j++){
                if(arr[j]>max) {
                    c = j;
                    max = arr[j];
                }
            }
            System.out.println(max);
            int temp = arr[c];
            arr[c]=arr[n-i];
            arr[n-i]=temp;
        }
        return arr;
    }
}
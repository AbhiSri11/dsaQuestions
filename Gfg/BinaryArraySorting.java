package com.Gfg;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] a = {0,0};
        int i=0;int j=a.length-1;
        while(i<j){
            while(a[i]!=1) i++;
            while(a[j]!=0) j--;
            if(i<a.length && j>=0 && i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

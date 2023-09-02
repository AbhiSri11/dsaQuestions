package com.leetcode;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int [] a ={3, 6, 12, 1, 5, 8};
        int n=6;
        int j=1;
        int i=0;
        while(i<n && j<n){
            if(a[i]%2==0){
                i=i+2;
               // j++;
            }
            else{
                if(a[j]%2==0){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i=i+2;
                   // j++;
                }
                else{
                    j++;
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

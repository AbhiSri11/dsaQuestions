package com.BitManupulation;

public class OneNumberPresentOnlyOne {
    public static void main(String[] args) {
        int[] arr = {2,9,2,5,6,5,7,7,6};
        int p = arr[0];
        for(int i=1;i<arr.length;i++){
            p=p^arr[i];
        }
        System.out.println(p);
    }
}

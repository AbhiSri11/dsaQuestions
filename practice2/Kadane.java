package com.practice2;

public class Kadane {
    public static void main(String[] args) {
        int ansAbhi =0;
        int maxAbhi = Integer.MIN_VALUE;
        int[] arr = {2,3,-4,5,6};
        for(int i=0;i<arr.length;i++){
            ansAbhi += arr[i];
            if(maxAbhi<ansAbhi) maxAbhi = ansAbhi;
            if(ansAbhi<0) ansAbhi = 0;
        }
        System.out.println(maxAbhi);
    }
}

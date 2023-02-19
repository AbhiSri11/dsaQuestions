package com.DP;

import java.util.Arrays;

public class Fibonacci {
    // memoization
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for(int i=0;i<10;i++){
//            arr[i]=-1;
//        }
//        System.out.println(fibo(8,arr));
//        System.out.println(Arrays.toString(arr));
//    }
//    static int fibo(int n,int[] arr){
//        if(n<=1){
//            arr[n]=n;
//            return n;
//        }
//        if(arr[n]!=-1){
//            return arr[n];
//        }
//        return arr[n]=arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
//    }

    //tabulation
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for(int i=0;i<10;i++){
//            arr[i]=-1;
//        }
//        int n = 10;
//        arr[0] = 0;
//        arr[1] = 1;
//        for(int i=2;i<=n;i++){
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        System.out.println(arr[n]);
//    }
    public static void main(String[] args) {
        int n =9;
        int prev2 = 0; // it will return if n is zero
        int prev = 1; // it will return if n is one
        int curr = 0;
        for(int i=2;i<=n;i++){
            curr = prev + prev2;
            prev2 = prev;
            prev =  curr;
        }
        System.out.println(curr);
    }
}

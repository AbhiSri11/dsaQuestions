package com.DP;

public class Fibonacci1 {
    public static void main(String[] args) {
        int n=7;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n]);
    }

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

    // memoization

//    public static void main(String[] args) {
//        int n = 6;
//        int[] arr = new int[n+1];
//        for(int i=0;i<=n;i++) arr[i] = -1;
//        fac(n,arr);
//        System.out.println(arr[n]);
//    }
//    public static int fac(int n, int[] arr){
//        if(n<=1) {
//            arr[n] = n;
//            return n;
//        }
//        if(arr[n] != -1) return arr[n];
//        return arr[n] = fac(n-1,arr) + fac(n-2,arr);
//    }

    //tabulation
//    public static void main(String[] args) {
//        int n= 6;
//        int[] arr = new int[n+1];
//        arr[0] = 0;
//        arr[1] = 1;
//        for(int i=2;i<=n;i++) arr[i] = arr[i-1]+arr[i-2];
//        System.out.println(arr[n]);
//    }
}

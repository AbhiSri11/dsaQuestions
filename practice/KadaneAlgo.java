package com.practice;

public class KadaneAlgo {
    public static void main(String[] args) {
        int n=8;
        int[] arr = {-47, 43, 94, -94, -93, -59, 31, -86};
        long sum =arr[0];
        long ans = arr[0];
        for(int i=1;i<n;i++){
            sum += arr[i];
            ans = Math.max(sum,ans);
            if(sum<0) sum=0;
        }
        System.out.println(ans);
    }
}

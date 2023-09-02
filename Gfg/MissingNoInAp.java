package com.Gfg;

public class MissingNoInAp {
    public static void main(String[] args) {
        int[] arr = {-42,-16};
        int st = 0;
        int end = arr.length-1;
        int d = arr[1]-arr[0];
        while(st<end-1){
            int mid = (st+end)/2;
            if((Math.abs(arr[mid] - arr[st]))/d == mid - st){
                st = mid;
            }

            else{
                end = mid;
            }
        }

        //if(end != -1)
        System.out.println(arr[st]+d);
        //return arr[st]+d;
    }
}

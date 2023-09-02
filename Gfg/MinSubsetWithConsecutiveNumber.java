package com.Gfg;

import java.util.Arrays;

public class MinSubsetWithConsecutiveNumber {
    public static void main(String[] args) {
        int[] arr = {10, 100, 105};
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            //boolean f=true;
            ans++;
            while(i<arr.length-1 && arr[i] == arr[i+1]-1){
                i++;
            }
        }
        System.out.println(ans);
    }
}

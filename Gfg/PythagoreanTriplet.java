package com.Gfg;

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5};
        int n=4;
        for(int i=0;i<n;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int sum = arr[i];
            int j=0;
            int k=i-1;
            while(j<k){
                int p = arr[j]+arr[k];
                if(sum==p) {
                    System.out.println("true");
                    break;
                }
                else if(sum>p) j++;
                else k--;
            }
        }
        System.out.println(false);
    }
}

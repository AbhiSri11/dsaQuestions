package com.Gfg;

import java.util.Arrays;

public class CountTheNumberOfSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,6};
        long l = 3;
        long r = 8;
        int n = 3;
        int j=0;
        long ans=0;
        int i=0;
        long ans2 = 0;
        long sum=0;
        while(j<n){
            sum += arr[j];
            while(sum>r) sum -= arr[i++];
            ans += j-i+1;
            j++;
        }
        i=0;j=0;sum=0;
        while(j<n){
            sum += arr[j];
            while(sum>l-1) sum -= arr[i++];
            ans2 += j-i+1;
            j++;
        }
        // while(i<j){
        //     sum = sum - arr[i++];
        //     if(sum<r && sum>l) ans++;
        // }
        System.out.println(ans-ans2);
    }
}

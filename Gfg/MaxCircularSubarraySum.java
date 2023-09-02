package com.Gfg;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        int[] a = {8,-8,9,-9,10,-11,12};
        int n = a.length;
        int sum = 0;
        int i=0;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(i<n){
            sum += a[i++];
            if(max<sum) max = sum;
            if(sum<0) sum = 0;
        }
        i=0;
        sum=0;
        for(int j=0;j<n;j++) a[j] = -1*a[j];
        while(i<n){
            sum += a[i++];
            if(max2<sum) max2 = sum;
            if(sum<0) sum = 0;
        }
        System.out.println(max-max2);
    }
}

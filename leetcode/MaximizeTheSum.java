package com.leetcode;
import java.util.*;
public class MaximizeTheSum {
    public static void main(String[] args) {
        int [] a = {-1,-2,-3,-4,-5};
        int n =5;
        int k=10;

        int ans = maximizeSum(a,n,k);
        System.out.println(ans);
    }
    static int maximizeSum(int a[], int n, int k)
    {
        // Your code goes here
        Arrays.sort(a);
        int i = 0;
        int z;
        for(int p=0;p<n;p++){
            if(a[p]<0){
                i++;
            }
        }
//        if(i>k){
            while(k>0){
                a[i-1]=-1*a[i-1];
                k--;
                i--;
            }

       // }
//        else{
//            for(int p=0;p<i;p++){
//                a[p]=a[p]*-1;
//            }
//            z=i;
//            for(i=i;i<k;i++){
//                a[z]=a[z]*-1;
//            }
//        }

        int ans = 0;
        for(int p=0;p<n;p++){
            ans=ans+a[p];
        }
        return ans;
    }
}

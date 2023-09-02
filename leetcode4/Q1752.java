package com.leetcode4;

public class Q1752 {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        boolean ans = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) ans = false;
        }
        //float f = 8.9f;
        //long h=999;
        //System.out.println(h);
        System.out.println(ans);
    }
}

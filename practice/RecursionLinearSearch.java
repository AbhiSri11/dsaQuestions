package com.practice;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int target=6;
        int ans=search(arr,0,0);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==target){
            return i;
        }
        else
            return search(arr,target,++i);
    }
}

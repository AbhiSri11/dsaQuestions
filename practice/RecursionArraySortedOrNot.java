package com.practice;

public class RecursionArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        boolean ans = sorting(arr,0);
        System.out.println(ans);
    }
    static boolean sorting(int[] arr, int i){
        if(i==arr.length-1)
            return true;
        if(arr[i]<arr[i+1])
            return sorting(arr,++i);
        else
            return false;
    }


}

package com.recursion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,7,8};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,++i);
    }

}

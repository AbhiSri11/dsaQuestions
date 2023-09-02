package com.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,4,23,2,54,36,56,23,124,2,5,4,2};
        System.out.println(search(arr,545,0));
    }
    static boolean search(int[] arr, int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || search(arr,target,++i);
    }
}

package com.practice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,5,9,7,5,11,2,4,6};
//        linear(0,1,arr);
        System.out.println(linear(0,1,arr));
        System.out.println(index(0,1,arr));
    }
    static boolean linear(int i, int target, int[] arr){
        if(i==arr.length) return false;
        return arr[i]==target || linear(i+1,target,arr);
    }
    static int index(int i, int target, int[] arr){
        if(i==arr.length) return -1;
        if(arr[i]== target) return i;
        return index(i+1,target,arr);
    }
}

package com.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,2,1};
        System.out.println(palin(arr,0));
    }
    static boolean palin(int[] arr, int i){
        if(i>arr.length/2){
            return true;
        }
        if(arr[i]!=arr[arr.length-1-i]){
            return false;
        }
        return palin(arr,++i);
    }
}

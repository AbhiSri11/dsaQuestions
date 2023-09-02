package com.RecursionByStriver;

public class CheckPalindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean check = pal(arr,0);
        System.out.println(check);
    }
    static boolean pal(int[] arr,int i){
        if(arr.length/2<=i)
            return true;
        if(arr[i]!=arr[arr.length-i-1]){
            return false;
        }
        return pal(arr,i+1);
    }
}

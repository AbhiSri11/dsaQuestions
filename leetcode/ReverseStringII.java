package com.leetcode;

public class ReverseStringII {
    public static void main(String[] args) {
        String s="abcdefg";
        String ans = reverseStr(s,3);
        System.out.println(ans);

    }
    static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        if(k>=arr.length)
            k=arr.length-1;
        for(int i=0;i<k/2;i++){
            char temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
        return s.valueOf(arr);
    }
}

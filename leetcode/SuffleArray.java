package com.leetcode;

public class SuffleArray {
    public static void main(String[] args) {
        String str = "abcdefgh";
        int[] arr ={4,5,6,7,0,2,1,3};
        String ans= restoreString(str,arr);
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }
}

package com.leetcode;

public class LongPressedName {
    public static void main(String[] args) {
        String s="saeed";
        String s1="ssaaedd";
        boolean ans =isLongPressedName(s,s1);
        System.out.println(ans);
    }
    static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int m=name.length();
        int n=typed.length();
        while(i<m && j<n){
            if(name.charAt(i)==typed.charAt(j))
                j++;
            else
                i++;
        }
        if(i==m-1 && j==n)
            return true;
        return false;
    }
}

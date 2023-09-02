package com.leetcode2;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        String s1 = removeDuplicates(s);
        System.out.println(s1);
    }
    static String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                if(i-1>=0)
                    i=i-2;
                else if(i==0)
                    i--;
            }
        }
        return str.toString();
    }
}

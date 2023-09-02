package com.leetcode;

public class PalangramScentence {
    public static void main(String[] args) {
        String arr = "leetcode";
        int [] hash = new int [26];
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)-97>=0 && arr.charAt(i)-97<26){
                hash[arr.charAt(i)-97]++;
                System.out.println(arr.charAt(i));
            }
        }
        for(int i=0;i<26;i++){
            if(hash[i]==0) {
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}

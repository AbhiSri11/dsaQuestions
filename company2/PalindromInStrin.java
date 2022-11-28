package com.company2;

public class PalindromInStrin {
    public static void main(String[] args) {
        String a ="abcdddecba";
        boolean ans =palindrome(a);
        System.out.println(ans);
    }
    static boolean palindrome(String a){
        int start = 0;
        int end = a.length() - 1;
        while(start<=end){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}

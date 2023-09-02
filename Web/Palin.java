package com.Web;

public class Palin {
    public static void main(String[] args) {
        // Question 7

        String k ="abcdddecba";
        boolean ans =palindrome(k);
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

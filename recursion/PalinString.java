package com.recursion;

public class PalinString {
    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(palin(s,0));
    }
    static boolean palin(String s,int i){
        if(i>s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
        }
        return palin(s,++i);
    }
}

package com.recursion;

public class SubsetOfString {
    public static void main(String[] args) {
        subset("","abc");
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char q=up.charAt(0);
        subset(p+q,up.substring(1));
        subset(p,up.substring(1));

    }
}

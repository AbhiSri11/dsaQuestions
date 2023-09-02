package com.recursion;

public class RemovingCharacter {
    public static void main(String[] args) {
        String s = "dsdadsa";
        String p = "";
        remove(s,p,0);
    }
    static void remove(String s,String p, int i){
        if(i==s.length()){
            System.out.println(p);
            return;
        }
        if(s.charAt(i)!='a') {
            remove(s, p + s.charAt(i), ++i);
        }
        else
            remove(s,p,++i);
    }
}

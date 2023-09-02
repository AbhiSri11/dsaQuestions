package com.practice;

public class RemoveA {
    public static void main(String[] args) {
        String s = "abaccabdadddddd";
        StringBuilder sb = new StringBuilder();
        remove(0,sb,s);
        System.out.println(sb);
    }
    public static void remove(int i,StringBuilder sb, String s){
        if(i==s.length()) return ;
        if(s.charAt(i)!='a') sb.append(s.charAt(i));
        remove(i+1,sb,s);
    }
}

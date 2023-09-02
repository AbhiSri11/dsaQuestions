package com.practice2;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "ready";
        String t = "adyer";
        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s,String t){
        HashMap<Character,Integer> hashAbhi = new HashMap<>();
        HashMap<Character,Integer> hashAbhi2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hashAbhi.containsKey(s.charAt(i))){
                hashAbhi.put(s.charAt(i),hashAbhi.get(s.charAt(i))+1);
            }
            else{
                hashAbhi.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hashAbhi2.containsKey(t.charAt(i))){
                hashAbhi2.put(t.charAt(i),hashAbhi2.get(t.charAt(i))+1);
            }
            else{
                hashAbhi2.put(t.charAt(i),1);
            }
        }
        if(hashAbhi.equals(hashAbhi2)) return true;
        return false;
    }
}

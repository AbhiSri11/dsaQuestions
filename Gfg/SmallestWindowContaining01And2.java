package com.Gfg;

import java.util.HashMap;

public class SmallestWindowContaining01And2 {
    public static void main(String[] args) {
        String s = "1210";
        int i=0;
        int j=0;
        HashMap<Character,Integer> hash = new HashMap<>();
        int min=Integer.MAX_VALUE;
        while(j<s.length()){
            while(j<s.length() && hash.size()<3){
                if(hash.containsKey(s.charAt(j))){
                    hash.put(s.charAt(j),hash.get(s.charAt(j))+1);
                }
                else{
                    hash.put(s.charAt(j),1);
                }
                j++;
            }
            //if(j==s.length() && hash.size()!=3) return -1;
            while(hash.size()==3){
                if(hash.get(s.charAt(i))>1){
                    hash.put(s.charAt(i),hash.get(s.charAt(i))-1);
                }
                else{
                    hash.remove(s.charAt(i));
                }
                if(min>j-i) min = j-i;
                i++;
            }
        }
        if(min == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }
}

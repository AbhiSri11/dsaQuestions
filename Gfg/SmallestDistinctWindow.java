package com.Gfg;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestDistinctWindow {
    public static void main(String[] args) {
        String s = "a";
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        HashSet<Character> map = new HashSet<>();

        for(int p=0;p<s.length();p++) map.add(s.charAt(p));

        int size = map.size();
        if(size == 1) System.out.println(1);
        HashMap<Character,Integer> hash = new HashMap<>();
        while(j<s.length()){
            while(j<s.length() && hash.size()<size){
                if(hash.containsKey(s.charAt(j))){
                    hash.put(s.charAt(j),hash.get(s.charAt(j))+1);
                }
                else{
                    hash.put(s.charAt(j),1);
                }
                if(hash.size()==size) {
                    if(j-i+1<min) min=j-i+1;
                }
                j++;
            }
            while(i<s.length() && hash.size()==size){
                if(hash.get(s.charAt(i))>1){
                    hash.put(s.charAt(i),hash.get(s.charAt(i))-1);
                }
                else hash.remove(s.charAt(i));
                if(j-i<min) min=j-i;
                i++;
            }
        }
        System.out.println(min);
    }
}

package com.Gfg;

import java.util.HashSet;

public class SumOfTwoLargeNumbersGfg {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> hash = new HashSet<>();
        while(j<s.length()){
            while(j<s.length() && !hash.contains(s.charAt(j))) {
                hash.add(s.charAt(j++));
                if (hash.size() > max) max = hash.size();
            }
            while(j<s.length() && s.charAt(i)!=s.charAt(j)){
                hash.remove(s.charAt(i++));
            }
            if(j<s.length()) i++;
            j++;
        }
        System.out.println(max);
    }
}

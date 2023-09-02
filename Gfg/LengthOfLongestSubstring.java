package com.Gfg;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "zyaaabcdefghijklmnopqrstuvwxyzgffg";
        HashSet<Character> hash = new HashSet<>();
        int i=0;int j=0;int max=0;
        while(j<s.length()){
            if(!hash.contains(s.charAt(j))){
                hash.add(s.charAt(j));
                max = Math.max(max,j-i+1);
            }
            else{
                while(s.charAt(i)!=s.charAt(j)){
                    hash.remove(s.charAt(i));
                    i++;
                }
                //hash.add(s.charAt(j));
            }
            j++;
        }
        System.out.println(max);
    }
}

package com.codeforcesShivansh;
import java.util.*;
public class Subseq_append {
    public static void main(String args[]){
        String s="coaching";
        String t="coding";
        System.out.println( appendCharacters(s,t));
    }
    public static int appendCharacters(String s, String t) {
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))) continue;
            hash.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            if(!hash.containsValue(t.charAt(i))){
                return t.length()-i;
            }
            if(i-1>=0){
                if(hash.get(t.charAt(i))<hash.get(t.charAt(i-1))) return t.length()-i;
            }
        }
        return 0;
    }

}

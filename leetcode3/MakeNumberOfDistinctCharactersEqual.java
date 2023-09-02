package com.leetcode3;

import java.util.*;

public class MakeNumberOfDistinctCharactersEqual {
    public static void main(String[] args) {
        String word1 = "ac";
        String word2 = "bbdd";
        System.out.println(isItPossible(word1,word2));
    }
    static boolean isItPossible(String word1, String word2) {
        HashMap<Character,Integer> hash = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();
        int i=0;
        while(i<word1.length()){
            if(hash.containsKey(word1.charAt(i))){
                hash.put(word1.charAt(i),hash.get(word1.charAt(i))+1);
            }
            else{
                hash.put(word1.charAt(i),1);
            }
            i++;
        }
        i=0;
        while(i<word2.length()){
            if(hash2.containsKey(word2.charAt(i))){
                hash2.put(word2.charAt(i),hash2.get(word2.charAt(i))+1);
            }
            else{
                hash2.put(word2.charAt(i),1);
            }
            i++;
        }
        if(Math.abs(hash.size()-hash2.size())>2){
            return false;
        }
        HashMap<Character,Integer> max = new HashMap<>();
        HashMap<Character,Integer> min = new HashMap<>();
        if(hash2.size()==hash.size()){
            int count =0;
            int count2 =0;
            for(Map.Entry<Character,Integer> k: min.entrySet()){
                System.out.println(k.getValue());
                if(k.getValue()==1 && !max.containsKey(k.getKey())){
                    count++;
                }
            }
            for(Map.Entry<Character,Integer> k: max.entrySet()){
                if(k.getValue()==1 && !min.containsKey(k.getKey())){
                    count2++;
                }
            }
            if(count==hash.size() || count2==hash.size()){
                return false;
            }
            return true;
        }
        if(hash2.size()>hash.size()){
            max = hash2;
            min = hash;
        }
        else{
            max = hash;
            min = hash2;
        }
        int p=0;
        for(Map.Entry<Character,Integer> k: min.entrySet()){
            System.out.println(k.getValue());
            if(k.getValue()>1){
                p++;
            }
        }
        if(p==0){
            return false;
        }
        if(max.size()==min.size()+1){
            for(Map.Entry<Character,Integer> k: max.entrySet()){
                if(k.getValue()>1 && !min.containsKey(k.getKey())){
                    return true;
                }
            }
            return false;
        }
        if(max.size()==min.size()+2){
            for(Map.Entry<Character,Integer> k: max.entrySet()){
                if(k.getValue()==1 && !min.containsKey(k.getKey())){
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}

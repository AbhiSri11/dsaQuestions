package com.leetcode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contest {
    public static void main(String[] args) {
        String word = "cbccca";
        boolean ans = equalFrequency(word);
        System.out.println(ans);
    }
    public static boolean equalFrequency(String word) {

        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else{
                map.put(word.charAt(i),1);
                list.add(word.charAt(i));
            }
        }
        int max = 0;
        int p=0;
        int t=0;
        int z=0;
        int l=0;
        int m=0;

        for(int i =0;i<list.size();i++){
            if( map.get(list.get(i)) ==  1)
                z++;
        }
        if(z==list.size())
            return true;
        z=0;
        for(int i =1;i<list.size();i++){
            if( map.get(list.get(i)) == map.get(list.get(i-1)) )
                z++;
            else{
                if(map.get(list.get(i)) == 1 )
                    l++;
                if(map.get(list.get(i-1)) == 1 )
                    m++;

            }
        }
        if(z==list.size()-2 && (l==1 || m==1))
            return true;

        for(int i=0;i<list.size();i++){
            int s = map.get(list.get(i));
            if(s>max){
                max = s;
            }
        }

        for(int i =0;i<list.size();i++){
            if(map.get(list.get(i))==max-1){
                p++;
            }
            else if(map.get(list.get(i))==max){
                t++;
            }
        }
        if(p==list.size()-1 && t==1)
            return true;
        return false;

    }
}

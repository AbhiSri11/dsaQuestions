package com.codeforcesShivansh;
import java.util.*;
public class Longest_Substring_K_Unique {
    public static void main(String args[]){
        String str="aabacbebebe";
        System.out.println(longestkSubstr(str,3));
    }
    public static int longestkSubstr(String s, int k) {
        HashSet<Character> hash=new HashSet<>();
        int i=0;
        int j=0;
        int ans=-1;
        while(j<s.length()){
            hash.add(s.charAt(j));
            if(hash.size()<k) j++;
            else if(hash.size()==k){
                if(j-i+1>ans) ans=j-i+1;
                j++;
            }
            else{
                while(hash.size()>k){
                    hash.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}

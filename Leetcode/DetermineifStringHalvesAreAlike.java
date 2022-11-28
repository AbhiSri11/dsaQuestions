package com.Leetcode;

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s ="book";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
    static boolean halvesAreAlike(String s) {
        s.toLowerCase();
        int count=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='o'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(s.charAt(i)=='o'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'){
                count2++;
            }
        }
        if(count != count2)
            return false;


        return true;
    }
}

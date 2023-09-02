package com.Gfg;

public class MetaStrings {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "keegs";
        //if(s1.length()!=s2.length()) return false;
        int first = -1;
        int second = -1;
        int count=0;
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count == 1) first = i;
                if(count == 2) second = i;
                if(count>2) System.out.println("false");
            }
            i++;
        }
        if(first != -1 && second != -1){
            if(s1.charAt(first)==s2.charAt(second) && s2.charAt(first)==s1.charAt(second)){
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}

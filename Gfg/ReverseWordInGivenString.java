package com.Gfg;

public class ReverseWordInGivenString {
    public static void main(String[] args) {
        String s="i.like";
        String ans = "";
        int j=s.length()-1;
        int i=s.length();
        while(j>=0){
            int p=j;
            if(j==0 || s.charAt(j)=='.'){
                String z = "";
                j++;
                while(j<i){
                    z = z + s.charAt(j++);
                }
                i=p;
                j=p;
                if(j!=0) z = z+'.';
                //if(j==0) z=z+s.charAt(0);
                ans = ans+z;
            }
            j--;
        }
        System.out.println(ans);
    }
}

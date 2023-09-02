package com.leetcode3;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    static public String compress(char[] chars) {
        String s="";
        int i=0;
        while(i<chars.length){
            int p =i;
            s=s+chars[i];
            int count = 0;
            while(i<chars.length){
                if(chars[i] == chars[p]){
                    count++;
                }
                else{
                    i--;
                    break;
                }
                i++;
            }
            if(count>1){
                s=s+count;
            }
            i++;
        }
        int j=0;
        while(j<s.length()){
            System.out.print(s.charAt(j)+ " ");
            chars[j] = s.charAt(j);
            j++;
        }
        return s;
    }
}

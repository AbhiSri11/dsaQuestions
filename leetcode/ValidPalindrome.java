package com.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s="A man, a plan, a canal: Panama";
        String s = "0P";
        boolean ans = isPalindrome(s);
        System.out.println(ans);

    }
    static boolean isPalindrome(String s) {
        String S=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while((S.charAt(i)<97 || S.charAt(i)>122) && (S.charAt(i)>57 || S.charAt(i)<48) ){
                if(i<j)
                    i++;
                else
                    return true;
            }
            while((S.charAt(j)<97 || S.charAt(j)>122) && (S.charAt(j)>57 || S.charAt(j)<48) ){
                if(i<j)
                    j--;
                else
                    return true;
            }
            if(S.charAt(i)==S.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}

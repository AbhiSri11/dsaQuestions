package com.Gfg;

public class LCP {
    public static void main(String[] args) {
        String[] s = {"abc", "abcd", "abcde", "abcdef"};
        String p = lcp(s,3);
        System.out.println(p);
    }
    static String lcp(String s[],int n)
    {
        // Write your code here
        int minLen = Integer.MAX_VALUE;
        String p = "";
        for(int i=0;i<s.length;i++){
            if(minLen>s[i].length()) minLen = s[i].length();
        }
        int ans = 0;
        for(int i=0;i<minLen;i++){
            char c = s[0].charAt(i);
            for(int j=0;j<s.length;j++){
                if(c != s[j].charAt(i)){
                    if(p.length()==0) {
                        p=p+"-1";
                    }
                    return p;
                }
            }
            p = p + s[0].charAt(i);
        }
        return p;
    }
}

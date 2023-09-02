package com.leetcode4;

public class Q8 {
    public static void main(String[] args) {
        String s= "2147483646";
        int ans = 0;
        boolean flag = true;
        boolean neg = false;
        boolean found = true;
        for(int i=0;i<s.length();i++){
            if(flag && s.charAt(i)==' ') continue;
            else if(flag && s.charAt(i)=='-'){
                neg = true;
                flag = false;
            }
            else if(flag && s.charAt(i)=='+') flag = false;
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                if(s.charAt(i)=='0' && found) {
                    flag = false;
                    continue;
                }
                else{
                    found=false;
                    int p = s.charAt(i)-'0';
                    if((float)ans>(float)Integer.MAX_VALUE/10){
                        ans = Integer.MAX_VALUE;
                        break;
                    }
                    ans = ans*10 + p;
                    flag=false;
                }
            }
            else break;
        }
        //if(neg && ans==Integer.MAX_VALUE) return -2147483648;
        if(neg) ans*=-1;

        System.out.println(ans);
    }
}

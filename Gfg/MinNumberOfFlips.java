package com.Gfg;

public class MinNumberOfFlips {
    public static void main(String[] args) {
        String s = "0101";
        // suppose at 1st place is 0
        int i=0;
        boolean flag=true;
        int ans = 0;
        while(i<s.length()){
            if(flag){
                if(s.charAt(i++)!='0') ans++;
            }
            else{
                if(s.charAt(i++)!='1') ans++;
            }
            flag=!flag;
        }
        // suppose at 1st place is 1
        System.out.println(ans);
        i=0;
        flag=true;
        int ans2 = 0;
        while(i<s.length()){
            if(flag){
                if(s.charAt(i++)!='1') ans2++;
            }
            else{
                if(s.charAt(i++)!='0') ans2++;
            }
            flag=!flag;
        }
        System.out.println(ans2);
    }
}

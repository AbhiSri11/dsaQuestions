package com.leetcode3;

import java.util.Scanner;

public class Hack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String s = "110011";
        int ans = 0;
        int i=1;
        int count = 0;
        count += s.charAt(0)-'0';
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                i++;
                continue;
            }
            else if(count<i){
                ans = ans + i-count;
                count += i-count;
            }
            i++;
        }
        System.out.println(ans);
    }
}

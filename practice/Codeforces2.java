package com.practice;

import java.util.*;

public class Codeforces2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n  = sc.nextInt();
            String s = sc.next();
            int max = 0;
            for(int i=0;i<s.length();i++){
                int j = s.charAt(i)-96;
                if(max<j){
                    max= j;
                }
            }
            System.out.println(max);
        }
    }
}

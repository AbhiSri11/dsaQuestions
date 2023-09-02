package com.practice;

import java.util.HashSet;
import java.util.Scanner;

public class codechef1406 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
            int n = 3;
            int k = 1;
            String s = "neo";
            HashSet<Character> hash = new HashSet<>();
            hash.add('a');
            hash.add('e');
            hash.add('i');
            hash.add('o');
            hash.add('u');
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(hash.contains(s.charAt(i))) count++;
            }
            int m = count/k;
            if(m==1){

            }
            int[] arr = new int[m-1];
            int count2 = 0;
            int j=0;
            for(int i=0;i<n;i++){
                if(count2==m){
                    arr[j]++;
                }
                if(hash.contains(s.charAt(i))) count2++;
                if(count2>m){
                    count2 = 1;
                    j++;
                    if(j==m-1) break;
                }
            }
            int ans = 1;
            for(int i=0;i<m-1;i++){
                if(arr[i]==0) arr[i]=1;
                ans = ans*arr[i];
                ans = ans%1000000007;
            }
            System.out.println(ans);

    }
}

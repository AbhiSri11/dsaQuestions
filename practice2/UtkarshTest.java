package com.practice2;

import java.util.HashMap;
import java.util.Scanner;

public class UtkarshTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int m = sc.nextInt();
        String s2 = sc.next();
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }
            else{
                hash.put(s.charAt(i),1);
            }
        }
        int count = 0;
        for(int i=0;i<m;i++){
            if(hash.containsKey(s2.charAt(i))){
                count++;
                if(hash.get(s2.charAt(i))==1) hash.remove(s2.charAt(i));
                else hash.put(s2.charAt(i),hash.get(s2.charAt(i))-1);
            }
        }
        System.out.println(count);
    }
}

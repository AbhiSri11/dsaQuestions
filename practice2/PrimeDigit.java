package com.practice2;

import java.util.HashSet;

public class PrimeDigit {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(2);
        hash.add(3);
        hash.add(5);
        hash.add(7);
        int ans = 0;
        int n = 1873;
        while(n>0){
            int p = n%10;
            if(hash.contains(p)) ans++;
            n = n/10;
        }
        System.out.println(ans);
    }
}

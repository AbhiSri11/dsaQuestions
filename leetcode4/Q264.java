package com.leetcode4;

import java.util.HashSet;

public class Q264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    static int nthUglyNumber(int n) {
        int i = 1;
        HashSet<Integer> hash = new HashSet<>();
        int k = 4;
        if (n == 1) {
            return 1;
        }
        hash.add(0);
        hash.add(2);
        hash.add(3);
        hash.add(5);
        while (hash.size() < n ) {
            if (k % 2 == 0 || k % 3 == 0 || k % 5 == 0) {
                if (hash.contains(k % 2) || hash.contains(k % 3) || hash.contains(k % 5)) {
                    hash.add(k);
                }
            }
            k++;
        }
        return k-1;
    }
}

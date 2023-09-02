package com.leetcode4;

import java.util.HashMap;

public class Q6328 {
    public static void main(String[] args) {
        String s="kqqqqqkkkq";
        String ch = "kq";
        int[] val={-6,6};
        maximumCostSubstrings(s,ch,val);
    }
    static int maximumCostSubstrings(String s, String chars, int[] vals) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            hash.put(chars.charAt(i), vals[i]);
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!hash.containsKey(s.charAt(i))) {
                sum += s.charAt(i) - 'a' + 1;
                if (sum > max) {
                    max = sum;
                }
            } else {
                if (hash.get(s.charAt(i)) >= 0) {
                    sum = sum + hash.get(s.charAt(i));
                    if (sum > max) {
                        max = sum;
                    }
                } else {
                    sum = 0;
                }
            }
        }
        System.out.println(sum);
        return max;
    }
}

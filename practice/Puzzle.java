package com.practice;

public class Puzzle {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        int ans = 0;
        while (m > 0 && n > 0) {
            ans = ans + m * n;
            m--;
            n--;
        }
        System.out.println(ans);
    }
}

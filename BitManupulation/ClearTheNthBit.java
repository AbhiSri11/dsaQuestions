package com.BitManupulation;

public class ClearTheNthBit {
    public static void main(String[] args) {
        int n=58;
        int i=3;
//        int p=Integer.MAX_VALUE;
//        p=p^(1<<i);
//        n=n&p;

        // 2nd Method

        int mask = ~(1<<i);
        n= n&mask;
        System.out.println(n);
    }
}

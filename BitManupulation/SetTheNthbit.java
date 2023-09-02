package com.BitManupulation;

public class SetTheNthbit {
    public static void main(String[] args) {
        int n=7;
        int i=2;
        int p=1;
        p=p<<i;
        n=n|p;
        System.out.println(n);
    }
}

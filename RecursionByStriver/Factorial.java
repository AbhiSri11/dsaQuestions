package com.RecursionByStriver;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int p=fact(n);
        System.out.println(p);
    }
    static int fact(int n){
        if(n<1)
            return 1;
        return n * fact(n-1);
    }
}

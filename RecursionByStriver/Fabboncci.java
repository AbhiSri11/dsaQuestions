package com.RecursionByStriver;

public class Fabboncci {
    public static void main(String[] args) {
        int n = 50;
        int ans = fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }
}

package com.Web;

public class Fibo {
    public static void main(String[] args) {
        // Question 10

        int ans3 = fibo(7);
        System.out.println(ans3);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

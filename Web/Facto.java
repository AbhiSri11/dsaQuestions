package com.Web;

public class Facto {
    public static void main(String[] args) {
        // Question 8

        int n=7;
        System.out.println(factori(n));
    }
    public static int factori(int a) {
        int fact = 1;
        for(int i=1;i<=a;i++)
            fact = fact*i;
        return fact;
    }
}

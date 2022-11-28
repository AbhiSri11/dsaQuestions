package com.company;

import java.util.Scanner;

import static com.company.Factorial.factori;

public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       //int fact = factorials(n);

        System.out.println(factori(n));
    }
    public static int factori(int a)
    {
        int fact = 1;
        for(int i=1;i<=a;i++)
            fact = fact*i;
        return fact;
    }
}

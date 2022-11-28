package com.company;
import java.util.*;
public class Fabanacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        int n=sc.nextInt();
        int count = 2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<n)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            count++;
        }
    }
}

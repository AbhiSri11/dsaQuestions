package com.practice;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int z = sc.nextInt();
        int max1 = 0;
        int min1 = 10;
        int max2 = 0;
        int min2 = 10;
        int max3 = 0;
        int min3 = 10;
        int d = a;
        while(d>0){
            int e = d%10;
            if(e>max1) max1 = e;
            if(e<min1) min1 = e;
            d = d/10;
        }
        d = b;
        while(d>0){
            int e = d%10;
            if(e>max2) max2 = e;
            if(e<min2) min2 = e;
            d = d/10;
        }
        d = c;
        while(d>0){
            int e = d%10;
            if(e>max3) max3 = e;
            if(e<min3) min3 = e;
            d = d/10;
        }
        int pin = (max1 * min1) * (max2 * min2) *(max3 * min3) - z;
        System.out.println(pin);
    }
}

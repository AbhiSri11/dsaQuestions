package com.practice;
import java.util.*;
public class Codeforces1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int mid =0;
            if(a>b && a>c){
                if(b>c)
                   mid  = b;
                else
                    mid = c;
            }
            if(b>a && b>c){
                if(a>c)
                    mid  = a;
                else
                    mid = c;
            }
            if(c>b && c>a){
                if(b>a)
                    mid  = b;
                else
                    mid = a;
            }
            System.out.println(mid);
        }
    }
}

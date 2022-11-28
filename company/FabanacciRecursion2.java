package com.company;

public class FabanacciRecursion2 {
    public static void main(String[] args) {
        int n=0;
        int m=1;
        int c=2;
        fabanachi(n,m,c);
    }
    static void fabanachi(int n, int m,int c){

        if(c==10){
            System.out.println(m);
            return;
        }
        n=m+n;
        int temp = n;
        n=m;
        m=temp;
        c++;
        fabanachi(n,m,c);
    }
}

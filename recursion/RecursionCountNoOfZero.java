package com.recursion;

public class RecursionCountNoOfZero {
    public static void main(String[] args) {
        int c=0;
        int ans= count(100000,c);
        System.out.println(ans);
    }
    static int count(int n,int c){
        if(n%10==0)
            c++;
        if(n>0)
            return count(n/10,c);
        return c-1;
    }
}

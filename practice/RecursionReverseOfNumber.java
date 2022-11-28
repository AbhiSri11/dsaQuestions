package com.practice;

public class RecursionReverseOfNumber {
    public static void main(String[] args) {
        int sum=0;
        reverse(12345,sum);
       // System.out.println(ans);
    }
    static void reverse(int n,int sum){
        if(n==0) {
            System.out.println(sum);
            return ;
        }
        sum=sum*10+n%10;
        reverse(n/10,sum);
    }
}

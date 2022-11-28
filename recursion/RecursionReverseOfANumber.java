package com.recursion;

public class RecursionReverseOfANumber {
    public static void main(String[] args) {

        reverse(23156,0);
    }
    static void reverse(int n,int sum) {
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum*10 + n%10;
        reverse(n/10,sum);
    }
}

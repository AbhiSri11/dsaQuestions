package com.recursion;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int n = 1284821;
        int sum[] = {0};
        System.out.println(palin(n,sum));
    }
    static boolean palin(int n,int[] sum){
        if(n>0){
            sum[0] = sum[0]*10 + n%10;
            palin(n/10,sum);
        }
        if(n==sum[0]){
            return true;
        }
        else{
            return false;
        }
    }
}

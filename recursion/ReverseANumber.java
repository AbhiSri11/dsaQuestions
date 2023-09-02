package com.recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int[] ans = {0};
        reverse(6574,ans);
        System.out.println(ans[0]);
    }
    static void reverse(int n,int[] ans){
        if(n==0){
            return;
        }
        ans[0] = ans[0]*10 + n%10;
        reverse(n/10,ans);
    }
}

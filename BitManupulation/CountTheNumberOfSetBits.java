package com.BitManupulation;

public class CountTheNumberOfSetBits {
    public static void main(String[] args) {
        int n=14;
        int cnt=0;
        while(n!=0){
            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        System.out.println(cnt);
    }
}

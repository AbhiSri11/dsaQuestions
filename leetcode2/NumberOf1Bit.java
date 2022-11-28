package com.leetcode2;

public class NumberOf1Bit {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int ans =hammingWeight(n);
        System.out.println(ans);
    }
    static int hammingWeight(int n) {
        int count =0;
        while(n !=0){
            if((n & 1) !=0)
                count++;
            n=n>>1;
        }
        return count;
    }
}

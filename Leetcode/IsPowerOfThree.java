package com.Leetcode;

public class IsPowerOfThree {
    public static void main(String[] args) {
        int n=1;
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }
    static boolean isPowerOfThree(int n) {
        if(n<1)
            return false;
        if(n==1)
            return true;
       return n%3==0 && isPowerOfThree(n/3);
//        else
//            return false;
//        return false;
    }

}

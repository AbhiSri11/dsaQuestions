package com.recursion;

public class RecursionPalindrome {
    static int m;
    public static void main(String[] args) {
        int n =124321;
        m=n;
        boolean ans = palindrome(n,0);
        System.out.println(ans);
    }
    static boolean palindrome(int n,int sum){
        if (n > 0){
            sum = sum*10 + n%10;
          return palindrome(n/10,sum);
        }
        System.out.println(sum+"   "+ m+"   "+n );
        if(m==sum)
            return true;
        return false;
    }
}

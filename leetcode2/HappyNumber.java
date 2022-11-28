package com.leetcode2;

public class HappyNumber {
    public static void main(String[] args) {
        boolean ans =isHappy(19);
        System.out.println(ans);
    }
    static boolean isHappy(int n) {
        int slow = n;
        int fast =n;
        do{
            slow = sq(slow);
            fast = sq(sq(fast));
        }
        while(slow != fast);
        if(slow == 1)
            return true;
        return false;

    }
    static int sq(int n){
        int ans=0;
        int rem=0;
        while(n>0){
           rem = n%10;
           ans = ans + rem*rem;
           n=n/10;
        }
        return ans;

    }
}

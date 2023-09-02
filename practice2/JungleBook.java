package com.practice2;

public class JungleBook {
    public static void main(String[] args) {
        int n = 37;
        int m = 20;
        long ans = 1;
        long ans2 = 1;
        int m2 = 1000000009;
        //long p = (long)Math.pow(5,20);
        for(int i =0;i<20;i++){
            ans *= 5;
            ans %= m2;
        }
        for(int i =0;i<17;i++) {
            ans2 *= 21;
            ans2 %= m2;
        }
        long r = (ans+ans2)%m;
        System.out.println(r);
    }
}

package com.company;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        int ans =main(5);
        System.out.println(ans);

    }
    static int main(int n){
        int ans = 0;
        int base =5;
        while(n>0){
            int last=n&1;
            ans = ans + last*base;
            base = base*5;
            n = n >> 1;
        }
        return ans;
    }
}

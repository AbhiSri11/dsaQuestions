package com.company2;
public class Prime {
    public static void main(String[] args) {
        int n=2;
      boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n)
    {
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
}

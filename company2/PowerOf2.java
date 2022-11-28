package com.company2;

public class PowerOf2 {
    public static void main(String[] args) {
        boolean ans = main(0);
        System.out.println(ans);
    }
    static boolean main(int n){
        int c=0;
        while(n>0){
            int last =n&1;
            if(last==1)
                c++;
            n=n>>1;
        }
        if(c==1)
            return true;
        return false;
    }
}

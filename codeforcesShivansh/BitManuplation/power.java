package com.codeforcesShivansh.BitManuplation;

public class power {
    public static void main(String[] args) {
        double x=4;
        System.out.println(myPow(x,3));
    }
    public static double myPow(double x, int n) {
        if(n<0) {
            x=1/x;
            n=n*-1;
        }
        return mypow(x,n);
    }
    public static double mypow(double x,int n){
        if(n==0){
            return 1;
        }
        double power=mypow(x,n-1);
        return x*power;
    }
}

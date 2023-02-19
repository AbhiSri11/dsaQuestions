package com.BitManupulation;

public class XorOfNumber1toN {
    public static void main(String[] args) {
        int n=129;
//        int p=1;
//        for(int i=2;i<=n;i++){
//            p=p^i;
//        }
        if(n%4==1){
            System.out.println(1);
        }
        else if(n%4==2){
            System.out.println(n+1);
        }
        else if(n%4==3){
            System.out.println(0);
        }
        else{
            System.out.println(n);
        }
        //System.out.println(p);
    }
}

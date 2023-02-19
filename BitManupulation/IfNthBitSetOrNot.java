package com.BitManupulation;

public class IfNthBitSetOrNot {
    public static void main(String[] args) {
        int n=8;
        int i=2;
        int p=1;
        p=p<<i;
        if((n&p)==0){
            System.out.println("not");
        }
        else{
            System.out.println("Yes");
        }
    }
}

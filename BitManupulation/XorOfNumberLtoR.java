package com.BitManupulation;

public class XorOfNumberLtoR {
    public static void main(String[] args) {
        int l=2;
        int r=4;
        l=l-1;
        if(l%4==1){
            l=1;
        }
        else if(l%4==2){
            l=l+1;
        }
        else if(l%4==3){
            l=0;
        }
        if(r%4==1){
            r=1;
        }
        else if(r%4==2){
            r=r+1;
        }
        else if(r%4==3){
            r=0;
        }
        System.out.println(l^r);
    }
}

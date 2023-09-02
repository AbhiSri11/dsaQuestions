package com.practice2;

public class Print0And1 {
    public static void main(String[] args) {
        int p = 7;
        System.out.println(fun(p));
    }
    static int fun(int p){
        while(p==1 && p==1){
            return 0;
        }
        while(p==0){
            return 1;
        }
        return p;
    }
//    static int fun(int p){
//        p=p^1;
//        return p;
//    }
}

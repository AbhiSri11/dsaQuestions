package com.company;

public class Recursion1 {
    public static void main(String[] args) {
        main(5);
      //  funRev(5);
    }
    static void main(int n){
        if(n>0){
            System.out.println(n);
            main(n-1);
        }
    }
    static void funRev(int n){
        if(n>0){
            main(n-1);
            System.out.println(n);
        }
    }
}

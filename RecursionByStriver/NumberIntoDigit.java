package com.RecursionByStriver;

import java.util.HashMap;

public class NumberIntoDigit {
    public static void main(String[] args) {
        int n = 0;
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(0,"Zero");
        hash.put(1,"One");
        hash.put(2,"Two");
        hash.put(3,"Three");
        hash.put(4,"Four");
        hash.put(5,"Five");
        hash.put(6,"Six");
        hash.put(7,"Seven");
        hash.put(8,"Eight");
        hash.put(9,"Nine");
        fun(n,hash,true);
    }
    static void fun(int n, HashMap<Integer,String> hash,boolean flag){
        if(flag && n==0){
            System.out.print("Zero");
            return;
        }
        else if (n==0) return;
        flag = false;

        fun(n/10,hash,flag);
        System.out.print(hash.get(n%10) + " ");
    }
}

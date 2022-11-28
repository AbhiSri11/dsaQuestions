package com.RecursionByStriver;

public class PrintName {
    public static void main(String[] args) {
        int i=5;
        print(1,i);
    }
    static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Abhinav");
        print(++i,n);
    }
}

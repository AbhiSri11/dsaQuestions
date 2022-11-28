package com.RecursionByStriver;

public class Print_1_to_n {
    public static void main(String[] args) {
        int i=5;
        // print(1,5);
        // printRev(5,5);
        // printBackTrak(5,5);
        // printRevBackTrak(1,5);
    }
    static void print(int i,int n){
        if(i>5){
            return;
        }
        System.out.println(i);
        print(++i,n);
    }
    static void printRev(int i,int n){
        if(i<=0){
            return;
        }
        System.out.println(i);
        printRev(--i,n);
    }
    static void printBackTrak(int i,int n){
        if(i<=0){
            return;
        }
        printBackTrak(i-1,n);
        System.out.println(i);
    }
    static void printRevBackTrak(int i, int n){
        if(i>n)
            return;
        printRevBackTrak(i+1,n);
        System.out.println(i);
    }
}
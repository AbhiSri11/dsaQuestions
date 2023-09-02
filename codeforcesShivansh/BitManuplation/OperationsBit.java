package com.codeforcesShivansh.BitManuplation;
import java.util.*;
public class OperationsBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int position=sc.nextInt();
        CHECK(num,position);
    }
    public static void ON(int x,int pos){
        int mask=1;
        mask=mask<<6-pos;
        System.out.println(Integer.toBinaryString(mask));
        x=x|mask;
        System.out.println(Integer.toBinaryString(x));
    }
    public static void OFF(int x,int pos){
        int mask=1;
        mask=mask<<6-pos;
        mask=~mask;
        x=x&mask;
        System.out.println(Integer.toBinaryString(x));
    }
    public static void toggle(int x,int pos){
        int mask=1;
        mask=mask<<6-pos;
        x=x^mask;
        System.out.println(Integer.toBinaryString(x));
    }
    public static void CHECK(int x,int pos){
        int mask=1;
        mask=mask<<6-pos;
        x=x&mask;
        if(x==0) System.out.println(0);
        else System.out.println(1);
    }
}

package com.codeforcesShivansh.BitManuplation;
import java.util.*;
public class Kernighan_Algorithm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(K(x));
    }
    public static int K(int x){
        int count=0;
        while(x!=0){
            x=x-(x&(-x));
            count++;
        }
        return count;
    }
}

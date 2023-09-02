package com.practice2;

public class PatternDamru {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        int kAbhi=(n-2)*2;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==n-1) break;
            for(int j=1;j<kAbhi;j++){
                System.out.print(" ");
            }
            kAbhi-=2;
            System.out.println("*");
        }
        kAbhi=n-2;
        System.out.println();
        for(int i=1;i<n-1;i++){
            for(int j=0;j<kAbhi;j++){
                System.out.print(" ");
            }
            kAbhi--;
            System.out.print("*");
            for(int j=1;j<2*i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
    }
}

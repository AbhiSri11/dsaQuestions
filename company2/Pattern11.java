package com.company2;

public class Pattern11 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) {
                if (j % 2 != 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}

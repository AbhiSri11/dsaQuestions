package com.company2;

public class Pattern20 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==1 || i==5)
                for(int j=1;j<5;j++)
                    System.out.print("*");
            else
                for(int j=1;j<5;j++){
                    if(j==1 && j==4) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            System.out.println();
        }
    }
}

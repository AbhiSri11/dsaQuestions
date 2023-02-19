package com.BitManupulation;

public class CheckIfNumberIsPowerOf2 {
    public static void main(String[] args) {
        int n = 9;
        int p=n&n-1;
        if(p==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

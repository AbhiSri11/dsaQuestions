package com.company2;
import java.util.Scanner;
public class Sum_function {
    public static void main(String[] args) {
        //sum();
        System.out.println(sum());
    }
    static int sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second value ");
        int n2 = sc.nextInt();
        int n3=n2+n1;
        return n3;
    }
}
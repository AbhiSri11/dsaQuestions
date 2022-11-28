package com.company;
import java.util.Scanner;
public class CaculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = calculateSum(n1,n2);
        System.out.println(n3);
    }
    public static int calculateSum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

}

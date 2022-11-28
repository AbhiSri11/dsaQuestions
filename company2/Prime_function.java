package com.company2;

public class Prime_function {
    public static void main(String[] args) {
        boolean r = prime(97);
        if(r)
            System.out.println("prime");
        else
            System.out.println("not prime");

    }
    static boolean prime(int num)
    {
        int i,c=0;
        boolean check = true;
        for(i=2;i*i<num;i++)
            if(num%i==0) {
                check = false;
            }
        return check;
    }
}

package com.company2;

public class SubtractTheProductSum {
    public static void main(String[] args) {
        int nums = 4421;
        int ans = multiply(nums)-add(nums);
        System.out.println(ans);
    }
    static int multiply(int num) {
        int temp,multi=1;
       while(num!=0) {
           temp=num%10;
           multi=multi*temp;
           num=num/10;
       }
       return multi;
    }
    static int add(int num){
        int temp,add=0;
        while(num!=0) {
            temp=num%10;
            add=add+temp;
            num=num/10;
        }
        return add;
    }
}

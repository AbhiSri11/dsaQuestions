package com.oops;

class poly{
    int sum(int b,int a){
        return a + b;
    }
    double sum(double a,int b){
        return a - b;
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        poly obj = new poly();
        System.out.println(obj.sum(3.5,5));
    }
}

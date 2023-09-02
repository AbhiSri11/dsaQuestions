package com.oops;
class A{
    public int add(int n1,int n2) {
        return n1 + n2;
    }
    public int sub(int n1,int n2) {
        return n1 - n2;
    }
}
class B extends A{
    public int add(int n1,int n2) {
        return n1 * n2;
    }
    public int div(int n1,int n2) {
        return n1 / n2;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(2,5));
    }
}

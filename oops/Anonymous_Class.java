package com.oops;

class C{
    public void show(){
        System.out.println("in C");
    }
}
class D extends C{
    public void show(){
        System.out.println("in D");
    }
}
public class Anonymous_Class {
    public static void main(String[] args) {
        C obj = new D();
        obj.show();
    }
}

package com.oops;

class A2{
    public static void show(){
        System.out.println("In A");
    }
}
class B2 extends A2{
    public static void show2(){
        System.out.println("In B");
    }
}
public class Upcastaing_Downcasting {
    public static void main(String[] args) {
        A2 obj = new B2();
//        obj.show();
        B2 obj2 = (B2) obj;
        obj2.show();
    }
}

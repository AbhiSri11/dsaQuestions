package com.oops;
class E{
    public void show(){
        System.out.println("In E");
    }
    public void show2(){
        System.out.println("In G");
    }
}
public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        E obj = new E() {
            public void show() {
                System.out.println("In F");
            }
            public void show2() {
                System.out.println("In H");
            }
        };
        obj.show2();
    }
}

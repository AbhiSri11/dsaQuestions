package com.oops;
class demo{
    int id;
    static int salary;
    String name;
    public void show(){
        System.out.println(id + " " + salary + " " + name);
    }
}
public class ClassVariable {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.id = 1;
        d1.salary = 1500;
        d1.name = "Abhi";

        demo d2 = new demo();
        d2.id = 2;
        d2.salary = 1600;
        d2.name = "Nav";

        demo d3 = new demo();
        d3.id = 3;
        d3.salary = 1700;
        d3.name = "Sri";

        d1.show();
        d2.show();
        d3.show();
    }
}

package com.company;

public class FunctionString {
    public static void main(String[] args) {

       String greeting = Sum("Abhinav");

        System.out.println(greeting);
    }
    static String Sum(String name){

        String greet = "Hello World " + name;

        return greet;
    }
}

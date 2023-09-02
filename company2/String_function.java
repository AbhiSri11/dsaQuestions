package com.company2;

public class String_function {
    static int x=90;
    public static void main(String[] args) {
        String name = "Abhinav";
        System.out.println(name2(name));
        System.out.println(x);
        int x = 9;
        System.out.println(x);
        fun();
        System.out.println(x);
    }
    static String name2(String name)
    {
      String newName="how are you "+ name;
      return newName;
    }
    static void fun(){
        System.out.println(x);
    }
}


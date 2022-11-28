package com.company;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter salary");
        int salary =sc.nextInt();
        if(salary>10000)
        {
            salary = salary + 2000;
        }
        else
        {
            salary = salary + 1000;
        }
        System.out.println(salary);



    }
}

package com.company;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int [] marks = new int [5];
      //input
      for(int i=0;i<5;i++)
      {
        marks[i]=sc.nextInt();
      }
      //output
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("enter the number for search");
        int n = sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==n)
            {
                System.out.println("the number is found at "+ i);
                //System.out.println(i);
            }
        }

    }
}

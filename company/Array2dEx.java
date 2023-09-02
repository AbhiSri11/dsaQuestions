package com.company;
import java.util.*;
public class Array2dEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int colu =sc.nextInt();
        int [][] marks = new int [rows][colu];
        for(int i = 0;i<rows; i++)
        {
            for(int j=0; j<colu; j++)
            {
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("******");
        for(int i = 0;i<rows; i++)
        {
            for(int j=0; j<colu; j++)
            {
                System.out.print(marks[i][j]+ " ");
            }
            System.out.println();
        }

    }

}

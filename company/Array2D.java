package com.company;
import java.util.*;
public class Array2D {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n,m;
       n=in.nextInt();
       m=in.nextInt();
       int[][] arr= new int[n][m];

       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j]=in.nextInt();
           }
       }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                //arr[i][j]=in.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

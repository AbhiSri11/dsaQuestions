package com.matrix;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();
        int n = 3;
        int m = 4;
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // ****  row wise print  **** \\

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // ****  column wise print  **** \\

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[j][i] + " ");
           }
            //System.out.println();
        }

        // ****  Wave wise print  **** \\

        for(int i=0;i<arr[0].length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[j][i] + " ");
                } else {
                    //System.out.print(arr.length - j - 1);
                    //System.out.println();
                    System.out.print(arr[arr.length - j - 1][i] + " ");
                }
            }
        }
    }
}

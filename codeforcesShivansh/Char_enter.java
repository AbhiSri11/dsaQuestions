package com.codeforcesShivansh;
import java.util.*;
public class Char_enter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char[][] arr=new char[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int g=sc.nextInt();
                arr[i][j]=(char)g;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

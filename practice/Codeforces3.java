package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n  = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int index = 0;
            int index2 = 0;
            int max = arr[0];
            for(int i=0;i<n;i++){
                if(max<arr[i]){
                    index = i;
                    max = arr[i];
                }
            }
            max = arr[0];
            for(int i=0;i<n;i++){
                if(i==index){
                    continue;
                }
                if(max<arr[i]){
                    index2 = i;
                    max = arr[i];
                }
            }
            for(int i=0;i<n;i++){
                if(i==index){
                    arr[i]=arr[i]-arr[index2];
                }
                else{
                    arr[i]= arr[i]-arr[index];
                }
            }
           for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
            //System.out.println(arr.toString());
        }
    }
}

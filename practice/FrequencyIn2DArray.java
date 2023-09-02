package com.practice;

public class FrequencyIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,2,1},{2,4,6}};
        int count =0;
        int[] arr2= new int[10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[arr[i][j]]++;
            }
        }
        for(int i=0;i<7;i++){
            if(arr2[i]>0)
                System.out.println("the number of frequency "+ i + " " + arr2[i]);
//            else
//                System.out.println(0);
        }
    }
}

package com.leetcode;
import java.util.*;
public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {3,7,8},{9,11,13},{15,16,17},
        };
        ArrayList<Integer> list = new ArrayList<>();
        list =luckyNumbers(arr);
        System.out.println(list);

    }
    static ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++){
            int min=matrix[i][0];
            int max=matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max)
                    max=matrix[j][i];
            }
            if(min==max)
                list.add(min);
        }
        return list;
    }
}

package com.leetcode3;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                ans[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int p=0;p<matrix.length;p++){
                        ans[p][j]=0;
                    }
                    for(int p=0;p<matrix[0].length;p++){
                        ans[i][p]=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = ans[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

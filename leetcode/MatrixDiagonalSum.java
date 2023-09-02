package com.leetcode;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = sum(arr);
        System.out.println(ans);

    }
    static int sum(int [][] mat){
        int ans =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || i+j==mat.length-1)
                    ans =ans+mat[i][j];
            }
        }
        System.out.println(mat.length);
        if((mat.length-1)%2==0)
            ans=ans-mat[mat.length/2][mat.length/2];
        return ans;
    }
}

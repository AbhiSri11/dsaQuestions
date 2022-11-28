package com.practice;

import java.util.Arrays;

public class Contest {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1},{1,0,1},{0,0,1}};
        int ans[][] = onesMinusZeros(arr);

        for(int i = 0;i<3;i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    static int[][] onesMinusZeros(int[][] arr) {
        int a = 0;
        int b = 0;
        int j=0;
        int p=0;
        int q=0;
        int[][] ans = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(;j<arr[0].length;j++){
                if(arr[p][q]==0){
                    a++;
                }
                if(arr[q][p]==0){
                    a++;
                }
                if(arr[p][q]==1){
                    b++;
                }
                if(arr[q][p]==1){
                    b++;
                }
            }
            ans[p][q]=b-a;
            a=0;b=0;j=0;
            q++;
            if(q==arr[0].length){
                p++;
                i=p;
                q=0;
                j=0;
            }
        }
        return ans;
    }
}

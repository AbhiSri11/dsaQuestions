package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Codechef1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
            int n = 3;
            int x = 8;
            int[] arr = {3,4,5};
            int[] brr = {2,4,2};
            int[][] dd = new int[n][2];

            for(int i = 0;i<n;i++){
                dd[i][0] = arr[i]+brr[i];
                dd[i][1] = arr[i];
            }

            Arrays.sort(dd,(a, b)->(a[0]-b[0]));
        int count = 0;
        for(int i=0;i<n;i++){
            if(x>=dd[i][0]){
                x = x-dd[i][0];
                count = count+1;
                dd[i][1] =Integer.MAX_VALUE;;
            }
            else{
                break;
            }
        }
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(dd[i][1]<min){
                min = dd[i][1];
            }
            if(min>=x){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}

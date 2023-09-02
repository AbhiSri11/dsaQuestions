package com.leetcode3;

import java.util.Arrays;

public class MinimumNumberOfArrows {
    public static void main(String[] args) {
        int[][] points = {{-2147483646,-2147483645},{2147483646,2147483647}};
//        if(points.length==1){
//            return 1;
//        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
//        Arrays.sort(points,(a, b)->(a[1]-b[1]));
        int i=1;
        int j=0;
        int count =0;
        while(points.length>i){
            if(points[i][0]<=points[j][1]){
                count++;
                i++;
            }
            else{
                j=i;
                i++;
            }
        }
        for(int p=0;p<2;p++){
            for(int z=0;z<2;z++){
                System.out.print(points[p][z] + " ");
            }
            System.out.println();
        }
        System.out.println(points.length-count);
    }
}

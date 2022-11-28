package com.Leetcode;
import java.util.*;
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0},
        };
        int[][] ans = new int[arr.length][arr.length];
        ans=flipAndInvertImage(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
    static int[][] flipAndInvertImage(int[][] image) {
        int p = image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < p / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][p - 1 - j];
                image[i][image[j].length - 1 - j] = temp;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < p; j++) {
                if (image[i][j] == 1)
                    image[i][j] = 0;
                else
                    image[i][j] = 1;
            }
        }
        return image;
    }
}

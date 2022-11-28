package com.company;
import java.util.*;
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] new2= {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans =flipAndInvertImage(new2);
        for(int row=0;row<ans.length;row++)
            System.out.println(Arrays.toString(ans[row]));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                int temp = image[i][j];
                image[i][j]=image[i][image[j].length-1-j];
                image[i][image[j].length-1-j]=temp;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                if(image[i][j]==1)
                    image[i][j]=0;
                else
                    image[i][j]=1;
            }
        }
        return image;
    }
}

package com.codeforcesShivansh.Garph;

public class Flood_fill {
    public static void main(String[] args) {
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        dfs(image,1,1,2,image[1][1]);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int[][]image,int i,int j,int color,int c){
        if(i<0 || i==image.length || j<0 || j==image[0].length || image[i][j]!=c) return;
        image[i][j]=color;
        dfs(image,i-1,j,color,c);
        dfs(image,i+1,j,color,c);
        dfs(image,i,j-1,color,c);
        dfs(image,i,j+1,color,c);
    }
}

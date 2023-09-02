package com.leetcode4;

public class QContest {
    public static void main(String[] args) {
        int[][] grid = {{8,6},{2,6}};
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) continue;
                int count = grid[i][j];
                for(int k=i-1;k>=0;k--){
                    if(grid[k][j]==0) break;
                    else{
                        count += grid[k][j];
                    }
                }
                for(int k=j-1;k>=0;k--){
                    if(grid[i][k]==0) break;
                    else{
                        count += grid[i][k];
                    }
                }
                for(int k=i+1;k<grid.length;k++){
                    if(grid[k][j]==0) break;
                    else{
                        count += grid[k][j];
                    }
                }
                for(int k=j+1;k<grid[0].length;k++){
                    if(grid[i][k]==0) break;
                    else{
                        count += grid[i][k];
                    }
                }
                ans[i][j]= count;
            }
        }
        int max = -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(ans[i][j] + " ");
                if(ans[i][j]>max) max = ans[i][j];
            }
            System.out.println();
        }
    }
}

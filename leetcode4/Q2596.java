package com.leetcode4;

public class Q2596 {
    public static void main(String[] args) {
        int[][] arr = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(arr));
    }
    static boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }
        int z = grid[0].length;
        int i = 0;
        int j = 0;
        for (int p = 1; p < grid[0].length * grid[0].length; p++) {
            if (i >= 2 && j >= 1 && grid[i - 2][j - 1] == p) {
                i = i - 2;
                j = j - 1;
            } else if (i >= 2 && j <= z - 2 && grid[i - 2][j + 1] == p) {
                i = i - 2;
                j = j + 1;
            } else if (i <= z - 3 && j <= z - 2 && grid[i + 2][j + 1] == p) {
                i = i + 2;
                j = j + 1;
            } else if (i <= z-3 && j >= 1 && grid[i + 2][j - 1] == p) {
                i = i + 2;
                j = j - 1;
            } else if (i >= 1 && j >= 2 && grid[i - 1][j - 2] == p) {
                i = i - 1;
                j = j - 2;
            } else if (i >= 1 && j <= z - 3 && grid[i - 1][j + 2] == p) {
                i = i - 1;
                j = j + 2;
            } else if (i <= z - 2 && j >= 2 && grid[i + 1][j - 2] == p) {
                i = i + 1;
                j = j - 2;
            } else if (i <= z - 2 && j <= z - 3 && grid[i + 1][j + 2] == p) {
                i = i + 1;
                j = j + 2;
            } else {
                return false;
            }
        }
        return true;
    }
}

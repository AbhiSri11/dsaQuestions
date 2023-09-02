package com.DP;

import java.util.ArrayList;

public class Triangle11 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        list3.add(3);list3.add(4);
        list4.add(6);list4.add(5);list4.add(7);
        list5.add(4);list5.add(1);list5.add(8);list5.add(3);
        list.add(new ArrayList<>(list2));
        list.add(new ArrayList<>(list3));
        list.add(new ArrayList<>(list4));
        list.add(new ArrayList<>(list5));
        int[][] dp = new int[list.size()][list.get(list.size()-1).size()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(tri(0,0,list,dp));
    }
    public static int tri(int i, int j,ArrayList<ArrayList<Integer>> triangle,int[][] dp) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        if (i >= triangle.get(i).size() || j >= triangle.get(triangle.size() - 1).size()) return 88888;
        if (dp[i][j] != -1) return dp[i][j];
        int left = triangle.get(i).get(j) + tri(i + 1, j, triangle, dp);
        int right = triangle.get(i).get(j) + tri(i + 1, j + 1, triangle, dp);
        return dp[i][j] = Math.min(left, right);
    }
}

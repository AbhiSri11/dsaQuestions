package com.Leetcode;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] arr= {
                {1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048},
        };
        int ans = maximumPopulation(arr);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs) {
        int count=1;
        int max=1;
        int min = logs[0][0];
        for(int i=0;i<logs.length-1;i++){
            count=1;
            for(int j=logs.length-1;j>i;j--){
                if(logs[i][1]>logs[j][0]){
                    count++;
                    if(count>max)
                        min=logs[j][0];
                    max=count;
                }
            }
        }
        return min;
    }
}

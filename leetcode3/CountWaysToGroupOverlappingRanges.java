package com.leetcode3;

import java.util.Arrays;

public class CountWaysToGroupOverlappingRanges {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{10,20},{2,5},{4,8}};
        System.out.println(countWays(nums));
    }
    static int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a,b)->(a[0]-b[0]));
        int count =0;
        for(int i=0;i<ranges.length;i++){
            //System.out.println(ranges[i][0] + " " + ranges[i][1]);
            if(ranges[i][1]>=ranges[i+1][0]){
                count++;
                int j=i;
                int k=i+1;
                while(k<ranges.length-1 && ranges[j][1]>=ranges[k][0])
                    k++;
                i=k;
            }

        }
        return (count*2)%1000000007;
    }
}

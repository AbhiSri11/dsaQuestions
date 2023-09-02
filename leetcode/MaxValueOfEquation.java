package com.leetcode;

public class MaxValueOfEquation {
    public static void main(String[] args) {
        int [][] arr = {{-17,13},{-15,14},{-14,-8},{-4,-12},{0,-13},{4,-14},{6,9},{14,2},{15,-2},{17,20}};
        int k=9;
        int ans = main(arr,k);
        System.out.println(ans);
    }
    static int main(int[][] points,int k){
        int max=-2147483648;
        for(int i=0;i<points.length-1;i++){
            int start = i+1;
            int end=points.length-1;
            int mid=0;
            while(start<=end){
                mid= start+(end-start)/2;
                if(points[mid][0]-points[i][0]<=k){
                    int ans=points[i][1]+points[mid][1]+points[mid][0]-points[i][0];
                    if(max<ans)
                        max=ans;
                    start = mid+1;
                }
                else
                    end= mid-1;
            }
        }
        return max;
    }
}

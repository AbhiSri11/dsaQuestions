package com.leetcode3;

public class Candy {
    public static void main(String[] args) {
        int [] ratings = {1,3,4,5,2};
        int ans = candy(ratings);
        System.out.println(ans);
    }
    static int candy(int[] ratings) {
        int[] p = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            p[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                p[i] = p[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                p[i] = p[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            sum = sum + p[i];
        }
        return sum;
    }
}

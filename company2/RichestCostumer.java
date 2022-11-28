package com.company2;

public class RichestCostumer {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {8,9,1,2},
        };
        int ans= main(arr);
        System.out.println(ans);
        }
    static int main(int [][] accounts) {
    int sum =0;
    int max=0;
        for (int row = 0; row < accounts.length; row++) {
            for(int col =0; col < accounts[row].length;col++) {
                sum = sum + accounts[row][col];
            }
            if(max<sum) {
            max=sum;
            }
            sum=0;
        }
        return max;
    }

}

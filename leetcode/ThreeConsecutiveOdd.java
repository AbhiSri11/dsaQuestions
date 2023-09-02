package com.leetcode;

public class ThreeConsecutiveOdd {
    public static void main(String[] args) {
        int[] arr ={2,6,4,1};
        boolean ans=threeConsecutiveOdds(arr);
        System.out.println(ans);
    }
    static boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(count==3)
                return true;
            if(arr[i]%2==0)
                count++;
            else
                count=0;
        }
        return false;
    }
}

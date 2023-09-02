package com.leetcode;

public class ValidPerfectSq {
    public static void main(String[] args) {
        boolean ans= main(13);
        System.out.println(ans);
    }
    static boolean main(int num){
        if(num==1)
            return true;
        int start =0;
        int end = num;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid==num/mid)
                return true;
            else if(mid>num/mid)
                end = mid -1;
            else
                start = mid +1;
        }
        return false;
    }
}

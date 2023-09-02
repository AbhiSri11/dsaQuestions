package com.leetcode;
import java.lang.*;
public class SqrtX {
    public static void main(String[] args) {
        int x = 5;
        boolean ans =isPerfectSquare(x);
        System.out.println(ans);
    }
    static boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        int start =0;
        int end = num;
        int mid=0;
        while(start<=end){
            mid=start+(end+start)/2;
            if(mid*mid==num)
                return true;
            else if(mid>num/mid)
                end = mid -1;
            else
                start = mid +1;
        }
        return false;
    }

}

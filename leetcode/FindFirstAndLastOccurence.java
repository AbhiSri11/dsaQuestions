package com.leetcode;
import java.util.*;
public class FindFirstAndLastOccurence {
    public static void main(String[] args) {
//        int[] arr ={5,7,7,7,8,8,10};
        int [] arr ={};
        int target = 0;
        int []ans = main(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] main(int [] arr, int target){

        int[] ans=new int[2];
        if(arr.length==0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        int start =0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>=target)
                end=mid-1;
            else
                start = mid+1;
        }
        if(arr[start]==target)
            ans[0]=start;
        else {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        start =0;
        end = arr.length-1;
        mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target)
                end=mid-1;
            else
                start = mid+1;
        }
        ans[1]=end;
        return ans;
    }
}
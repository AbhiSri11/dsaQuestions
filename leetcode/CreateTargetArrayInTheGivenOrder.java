package com.leetcode;
import java.util.*;
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] arr2 = {0,1,2,2,1};
        int[] ans = new int[arr.length];
        ans=createTargetArray(arr,arr2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(0);
        }
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}

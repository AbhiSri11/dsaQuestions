package com.leetcode3;
import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] arr = {9,2,4,6,8,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        int k=0;
        int[] nums = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                nums[k++] = arr[i];
            }
            else{
                nums[count++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

package com.leetcode;
import java.util.*;
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {0,1};
        int[] ans =new int [2];
        ans=main(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] main(int [] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){

            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j--;
            }
            if(nums[i]%2==0)
                i++;
            if(nums[j]%2!=0)
                j--;
        }
        return nums;
    }
}

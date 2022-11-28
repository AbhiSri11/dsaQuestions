package com.company2;
import java.util.*;
public class SetMismatching {
    public static void main(String[] args) {
        int[] arr ={2,2,1,4};
        int [] ans = cyclic(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] cyclic(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else
                i++;
            int[] ans= new int[10000];
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1){
                    ans[c]=j;
                    ans[c+1]=j+1;
                    c++;
                }
            }
            System.out.println(Arrays.toString(ans));
            return ans;
        }
        int[] ans={-1,-1};
       return ans;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

package com.leetcode;

public class TriangularSum {
    public static void main(String[] args) {
        int[] arr= {1,1};
        int ans= main(arr);
        System.out.println(ans);
    }
   static int main(int[] nums) {
        int[] arr=new int[nums.length];
        int n = nums.length-1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            arr[j]=nums[j];
        }
        while(n>1){
            if(i==n){
                i=0;
                n--;
            }
            arr[i]=arr[i]+arr[i+1];
            if(arr[i]>9)
                arr[i]=arr[i]%10;
            i++;
        }
        return arr[0];
    }
}

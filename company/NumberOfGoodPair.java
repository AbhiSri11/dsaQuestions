package com.company;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        int [] nums ={1,1,1,1};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
    static int numIdenticalPairs(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(i<nums.length-1){
            if(j==i){
                i++;
                j=nums.length-1;
            }
            if(nums[i]==nums[j]){
                k++;
                j--;
            }
            else
            j--;
        }
        return k;
    }
}

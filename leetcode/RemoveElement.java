package com.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int target=3;
        int ans = remove(arr,target);
        for(int i=0;i<=ans;i++)
            System.out.println(arr[i]);
    }
    static int remove(int [] nums,int val){
        int j=nums.length-1;
        int i= 0;
        while(j>i) {
            if (nums[j] != val && nums[i] == val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            } else {
                if (nums[j] == val)
                    j--;
                if (nums[i] != val)
                    i++;
            }

        }
        return i;
    }
}

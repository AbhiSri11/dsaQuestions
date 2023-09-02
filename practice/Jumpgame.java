package com.practice;

public class Jumpgame {
    public static void main(String[] args) {
        int[] arr={3,0,2,1,2};
        int start=2;
        if(canReach(arr,start)){
            System.out.println("true");
        }
    }
    public static boolean canReach(int[] arr, int start) {
        return call(start,arr);
    }
    public static boolean call(int i,int[] nums){
        if(nums[i]==0) return true;

        boolean f=false;
        boolean s=false;
        if(i-nums[i]>=0){
            f=call(i-nums[i],nums);
        }
        if(f==true) return true;
        if(i+nums[i]<=nums.length-1){
            s=call(i+nums[i],nums);
        }
        if(f||s) return true;
        return false;
}

}

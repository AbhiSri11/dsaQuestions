package com.leetcode3;

public class LeetcodeContest {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5,2};
        System.out.println(findScore(nums));
    }
    static long findScore(int[] nums) {
        long ans = 0;
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int z=-1;
            int p = -1;
            int g = -1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0)
                    if(min>nums[j]){
                        min = nums[j];
                        z = j;
                        p=z-1;
                        g=z+1;
                    }
            }
            if(z==-1){
                break;
            }
            ans = ans + nums[z];
            nums[z] = 0;
            if(p!=-1){
                nums[p]=0;
            }
            if(g!=-1 && g!=nums.length){
                nums[g]=0;
            }
        }
        return ans;
    }
}

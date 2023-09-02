package com.codeforcesShivansh.No;
import java.util.*;
public class Four_Sum {
    public static void main(String[] args) {
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        System.out.println(fourSum(nums,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                for(int j=i+1;j<nums.length-2;j++){
                    if(j==1 || nums[j]!=nums[j-1]){
                        int s=target-(nums[i]+nums[j]);
                        int l=j+1;
                        int h=nums.length-1;
                        while(l<h){
                            if(nums[l]+nums[h]==s){
                                list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[h]));
                                while(l<h && nums[l]==nums[l+1]) l++;
                                while(h>l && nums[h]==nums[h-1]) h--;
                                l++;
                                h--;
                            }else if(nums[l]+nums[h]<s) l++;
                            else h--;
                        }
                    }
                }
            }

        }
        return list;
    }
}

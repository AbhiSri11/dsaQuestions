package com.codeforcesShivansh;
import java.util.*;
public class Longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] arr={0,0};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return nums.length;
        HashSet<Integer> hash=new HashSet<>();
        HashSet<Integer> visited=new HashSet<>();
        for(Integer e:nums) hash.add(e);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i]+1) && !visited.contains(nums[i])){
                visited.add(nums[i]);
                int len=1;
                int temp=nums[i];
                while(hash.contains(temp+1)){
                    visited.add(temp+1);
                    len++;
                    temp=temp+1;
                }
                if(len==nums.length){
                    ans=len;
                    break;
                }
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
}

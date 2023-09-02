package com.leetcode4;

import java.util.ArrayList;
import java.util.Arrays;

public class QContest2{
    public static void main(String[] args) {
        int[] nums = {1,2,4,3};
        long ans = 0;
        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            arr[i] =nums[i];
        }
        Arrays.sort(arr);
        int count = 0;
        int i=0;
        while(count<nums.length){
            if(list.get(i)==arr[count]){
                list.remove(Integer.valueOf(arr[count]));
                count++;
            }
            if(list.size()!=0){
                int p = list.remove(0);
                list.add(p);
            }
            i++;
            ans++;
            if(i==list.size()) i=0;
        }
        System.out.println(ans);
    }
}

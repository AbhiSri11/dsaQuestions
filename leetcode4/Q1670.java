package com.leetcode4;

import java.util.*;

public class Q1670 {
    public static void main(String[] args) {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        HashMap<Integer,Integer> hash = new HashMap<>();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] arr = new int[r[i]-l[i]+1];
            int k = 0;
            for(int j=l[i];j<=r[i];j++){
                arr[k++]=nums[j];
            }
            if(arr.length==1) list.add(true);

            else{
                Arrays.sort(arr);
                int diff = arr[1]-arr[0];
                int p=2;
                boolean flag = true;
                while(p<arr.length){
                    if(arr[p]-arr[p-1]!=diff)
                        flag = false;
                    p++;
                }
                if(flag) list.add(true);
                else list.add(false);
            }
        }
        System.out.println(list);
    }
}

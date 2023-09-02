package com.recursion;

import java.util.*;
import java.util.Arrays;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target = 8;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> hash = new HashSet<>();
        comb(arr,target,list,0,0,hash);
    }
    static void comb(int[]arr,int target, ArrayList<Integer> list,int sum,int i,HashSet<ArrayList<Integer>> hash){
        if(target<sum){
            return;
        }
        if(i==arr.length){
            if(target==sum && !hash.contains(list)){
                System.out.println(list);
                hash.add(list);
            }
            return;
        }
        list.add(arr[i]);
        comb(arr,target,list,sum+arr[i],i+1,hash);
        list.remove(list.size()-1);
        comb(arr,target,list,sum,i+1,hash);
    }
}

package com.recursion;

import java.util.*;

public class SubsetSumm {
    public static void main(String[] args) {
        int[] arr={2,3};
        ArrayList<Integer> list = new ArrayList<>();
        comb(arr,list,0,0);
        Collections.sort(list);
        System.out.println(list);
    }
    static void comb(int[] arr, ArrayList<Integer> list,int sum,int i){
        if(i==arr.length){
            list.add(sum);
            return;
        }
        sum = sum + arr[i];
        comb(arr,list,sum,i+1);
        sum = sum - arr[i];
        comb(arr,list,sum,i+1);
    }
}

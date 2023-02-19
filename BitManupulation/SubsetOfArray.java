package com.BitManupulation;

import java.util.ArrayList;

public class SubsetOfArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] arr = {1,2,3};
        int n=arr.length;
        for(int i=0;i<(1<<n);i++){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))==0){
                    ds.add(arr[j]);
                }
            }
            list.add(new ArrayList<>(ds));
        }
        System.out.println(list);
    }
}

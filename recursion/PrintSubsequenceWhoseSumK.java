package com.recursion;

import java.util.ArrayList;

public class PrintSubsequenceWhoseSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        print(arr,list,0,3,0);
    }
    static void print(int[] arr, ArrayList<Integer> list,int i,int k,int sum){
        if(i>=3){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];
        print(arr,list,i+1,k,sum);
        list.remove(list.size()-1);
        sum-=arr[i];
        print(arr,list,i+1,k,sum);
    }
}

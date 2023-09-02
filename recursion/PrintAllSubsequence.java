package com.recursion;

import java.util.ArrayList;

public class PrintAllSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        print(arr,list,0);
    }
    static void print(int[] arr, ArrayList<Integer> list,int i){
        if(i>=3){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        print(arr,list,i+1);
        list.remove(list.size()-1);
        print(arr,list,i+1);
    }
}

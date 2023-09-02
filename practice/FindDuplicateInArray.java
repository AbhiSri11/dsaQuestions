package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,15,11,19,20,2,4,25,14,23,14};
        ArrayList<Integer> list = new ArrayList<>();
        list = duplicates(arr,26);
        System.out.println(list);
    }
    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
                list2.add(arr[i]);
            }
        }
        for(int i=0;i<list2.size();i++){
            if(map.get(list2.get(i))>1){
                list.add(list2.get(i));
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        return list;
    }
}

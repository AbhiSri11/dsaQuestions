package com.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeSet {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,234,2,35,6,3,1,3,6,7};
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(tree.containsKey(arr[i])){
                tree.put(arr[i],tree.get(arr[i])+1);
            }
            else{
                tree.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : tree.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

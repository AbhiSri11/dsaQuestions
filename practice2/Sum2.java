package com.practice2;

import java.util.*;
class Pair{
    int v;
    int t;
    void Pair(int v,int t){
        this.v = v;
        this.t = t;
    }
}
public class Sum2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 6;
        int target = 3;
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        twoSum(arr,target,n);
    }
    public static void twoSum(ArrayList<Integer> arr, int target, int n) {
        // Write your code here.
        ArrayList<Pair> list = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hash.containsKey(arr.get(i))){
                hash.put(arr.get(i),hash.get(arr.get(i))+1);
            }
            else hash.put(arr.get(i),1);
        }
        for(int i=0;i<n;i++){
            if(hash.containsKey(target-arr.get(i))){
                //pair p = new pair(arr.get(i),target-arr.get(i));
                //list.add(p);
                int p = target-arr.get(i);
                System.out.println(arr.get(i) + " " + p);
                if(hash.get(target-arr.get(i))==1) hash.remove(target-arr.get(i));
                else hash.put(target-arr.get(i),hash.get(target-arr.get(i))-1);

                if(hash.get(arr.get(i))==1) hash.remove(arr.get(i));
                else hash.put(arr.get(i),hash.get(arr.get(i))-1);
            }
        }
        //return list;
    }
}

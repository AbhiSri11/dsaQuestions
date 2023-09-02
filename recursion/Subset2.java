package com.recursion;
import java.util.*;
public class Subset2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> hash = new HashSet<>();
        sub(arr,list,hash,0);
    }
    static void sub(int[] arr, ArrayList<Integer> list, HashSet<ArrayList<Integer>> hash,int i){
        if(i==arr.length){
            if(!hash.contains(list)){
                System.out.println(list);
                hash.add(list);
            }
            return;
        }
        list.add(arr[i]);
        sub(arr,list,hash,i+1);
        list.remove(list.size()-1);
        sub(arr,list,hash,i+1);
    }
}

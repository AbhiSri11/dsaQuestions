package com.RecursionByStriver;
import java.util.*;
public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        subsequence(arr,0,list);
    }
    static void subsequence(int[] arr, int ind, ArrayList list){
        if(ind>=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        subsequence(arr,ind+1,list);
        list.remove(list.size()-1);
        subsequence(arr,ind+1,list);
    }
}

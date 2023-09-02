package com.leetcode4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q239 {
    public static void main(String[] args) {
        int[] arr ={-7,-8,7,5,7,1,6,0};
        int k=4;
        int[] list = new int[arr.length-k+1];
        ArrayList<Integer> qu = new ArrayList<>();
        int i=0;
        int j=0;
        int p=0;
        while(j<arr.length){
            int ind = qu.size()-1;
            while(qu.size()!=0 && qu.get(ind)<arr[j]){
                qu.remove(ind--);
            }
            qu.add(arr[j]);
            if(j-i+1<k){
                j++;
            }
            else{
                list[p++] = qu.get(0);
                 if(arr[i]==qu.get(0)){
                     qu.remove(0);
                 }
                j++;
                i++;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}

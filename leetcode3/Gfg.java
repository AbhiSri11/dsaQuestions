package com.leetcode3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Gfg {
    public static void main(String[] args) {
        int[] id = {5, 1, 3, 2, 2, 4, 3, 4, 1};
        System.out.println(minimumBeauty(id,9));
    }
    static int minimumBeauty(int id[], int n){
        // Code Here.
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<id.length;i++){
            if(hash.containsKey(id[i])){
                hash.put(id[i],hash.get(id[i])+1);
            }
            else{
                hash.put(id[i],1);
            }
        }
        int i=0;
        int[] arr = new int[hash.size()];
        for(Map.Entry<Integer,Integer> k: hash.entrySet()){
            arr[i]=k.getValue();
            i++;
        }
        int ans=1;
        Arrays.sort(arr);
        i=arr.length-1;
        while(i>0){
            if(arr[i]==arr[i-1]){
                ans++;
            }
            else{
                break;
            }
            i++;
        }
        return ans;
    }
}

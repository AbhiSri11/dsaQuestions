package com.practice2;

import java.util.HashMap;
import java.util.Map;

public class MohitWipro {
    public static void main(String[] args) {
        int[] input1 = {5,123,12,45,62,77,89,23,12,14,11,14,12,90,89,12};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<input1.length;i++){
            if(hash.containsKey(input1[i])){
                hash.put(input1[i],hash.get(input1[i])+1);
            }
            else{
                hash.put(input1[i],1);
            }
        }
        int[] arr = new int[hash.size()];
        int p=0;
        int max = 0;
        int max2 = 0;
        int min = input1.length;
        int maxV = 0;
        int minV = 0;
        int max2V = 0;

        for(Map.Entry<Integer,Integer> k: hash.entrySet()){
            if(k.getValue()>max){
                maxV = k.getKey();
                max = k.getValue();
            }
            if(k.getValue()<min){
                minV = k.getKey();
                min = k.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> k: hash.entrySet()){
            if(k.getValue()!=max && k.getValue()>max2){
                max2V = k.getKey();
                max2 = k.getValue();
            }
        }
        String ans = maxV+""+max2V+""+minV;
        System.out.println(ans);
    }
}

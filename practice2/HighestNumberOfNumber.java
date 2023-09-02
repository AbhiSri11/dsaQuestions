package com.practice2;

import java.util.HashMap;
import java.util.Map;

public class HighestNumberOfNumber {
    public static void main(String[] args) {
        int[] input1 = {5,123,12,45,62,77,89,23,12,14,11,14,12,90,89,12};
        int input2 = 16;
        System.out.println(ways(input1,input2));
    }
    public static int ways(int[]input1,int input2){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<input2;i++){
            if(hash.containsKey(input1[i])){
                hash.put(input1[i],hash.get(input1[i])+1);
            }
            else
                hash.put(input1[i],1);
        }
        int max = 0;
        int maxI = Integer.MIN_VALUE;
        int max2 = 0;
        int maxI2 = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> k:hash.entrySet()){
            if(k.getValue()>max){
                maxI2 = maxI;
                max2 = max;
                maxI = k.getKey();
                max = k.getValue();
            }
            else if(k.getValue()>max2){
                maxI2 = k.getKey();
                max2 = k.getValue();
            }
            if(k.getValue()==max){
                maxI = Math.max(maxI,k.getKey());
            }
            if(k.getValue()==max2){
                maxI2 = Math.max(maxI2,k.getKey());
            }
        }
        String s = maxI + "" + maxI2;
        return Integer.parseInt(s);
    }
}

package com.company;
import java.util.*;
public class CountOfSmallerNumber {
    public static void main(String[] args) {
        int [] arr ={5,2,6,1};
        countSmaller(arr);
    }

    static List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int k=0;
        int j=nums.length-1;
        while(i<nums.length-1){
            if(i==j){
                list.add(k);
                k=0;
                i++;
                j=nums.length-1;
            }
            if(nums[i]>nums[j]){
                k++;
                j--;
            }
            else
                j--;
        }
        list.add(0);
        for(int p=0;i<list.size();i++)
            System.out.println(list.get(i));
        return list;
    }
}

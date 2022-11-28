package com.recursion;
import java.util.*;
public class RecursionLinearSearchByArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,18,18,18,9,8,7};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2= main(arr,18,0,list);
        System.out.println(list2);
    }
    static ArrayList<Integer> main(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        return main(arr,target,++index,list);
    }
}

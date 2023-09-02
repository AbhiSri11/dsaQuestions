package com.recursion;
import java.util.ArrayList;
public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();
        comb(arr,target,list,0,0);
    }
    static void comb(int[]arr,int target, ArrayList<Integer> list,int sum,int i){
        if(target<sum){
            return;
        }
        if(i==arr.length){
            if(target==sum){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        comb(arr,target,list,sum+arr[i],i);
        list.remove(list.size()-1);
        comb(arr,target,list,sum,i+1);
    }
}

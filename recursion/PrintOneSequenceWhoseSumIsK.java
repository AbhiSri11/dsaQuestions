package com.recursion;

import java.util.ArrayList;

public class PrintOneSequenceWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        sub(arr,list,0,2,0);
    }
    static boolean sub(int[] arr, ArrayList<Integer> list, int i, int k, int sum){
        if(i>=3){
            if(sum==k){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[i]);
        sum+=arr[i];
        if(sub(arr,list,i+1,k,sum)==true) return true;
        list.remove(list.size()-1);
        sum-=arr[i];
        if(sub(arr,list,i+1,k,sum)==true) return true;
        return false;
    }
}

package com.RecursionByStriver;

import java.util.ArrayList;

public class CountSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,4,1};
        ArrayList<Integer> list = new ArrayList<>();
        int k =2;
        int sum =0;
        int p = subsequence(arr,0,list,sum,k);
        System.out.println(p);
    }
    static int subsequence(int[] arr, int ind, ArrayList list, int sum, int k){
        if(ind>=arr.length){
            if(sum == k)
                return 1;
            return 0;
        }
        list.add(arr[ind]);
        sum=sum + arr[ind];
        int l = subsequence(arr,ind+1,list,sum,k);
        sum=sum - arr[ind];
        list.remove(list.size()-1);
        int r = subsequence(arr,ind+1,list,sum,k);
        return l+r;
    }
}

package com.RecursionByStriver;

import java.util.*;

//public class SubsequencesWithSumK {
//    public static void main(String[] args) {
//        int[] arr = {1,2,1};
//        ArrayList<Integer> list = new ArrayList<>();
//        int k =2;
//        int sum =0;
//        subsequence(arr,0,list,sum,k);
//    }
//    static void subsequence(int[] arr, int ind, ArrayList list,int sum,int k){
//        if(ind>=arr.length){
//            if(sum == k)
//                System.out.println(list);
//            return;
//        }
//        list.add(arr[ind]);
//        sum=sum + arr[ind];
//        subsequence(arr,ind+1,list,sum,k);
//        sum=sum - arr[ind];
//        list.remove(list.size()-1);
//        subsequence(arr,ind+1,list,sum,k);
//    }
//}
import java.util.*;

package com.Gfg;

import java.util.ArrayList;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1 ,1 ,3 ,6 ,6 ,12 ,13 ,18 ,25 ,32 ,37, 37, 41 ,42};
        int[] arr2 = {4 ,8, 8, 8, 9, 10, 10, 17, 22, 23, 25, 31, 34, 38, 38, 39, 42, 46};
        int i=0;int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(i!=0 && j!=0){
                if(arr1[i]==arr1[i-1]){
                    i++;
                    continue;
                }
                if(arr2[j]==arr2[j-1]){
                    j++;
                    continue;
                }
            }
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                list.add(arr2[j]);
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
            }
        }
        while(i<arr1.length){
            if(i != 0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            list.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            if(j!=0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            list.add(arr2[j]);
            j++;
        }
        System.out.println(list);
    }
}

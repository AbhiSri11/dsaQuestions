package com.leetcode2;
import java.util.*;
public class FindKClosestElement {
    public static void main(String[] args) {
        int [] arr = {3,5,8,10};
        ArrayList<Integer> list2 = new ArrayList<>();
        list2 = findClosestElements(arr,2,15);
        System.out.println(list2);
    }
    static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        int o=end;
        int l=0;
        int s=0;
        if(k==0)
            return list;
        if(x<=arr[0]){
            for(int p=0;p<k;p++){
                list.add(arr[p]);
            }
            return list;
        }
        if(x>arr[end]){
            for(int y=arr.length-k;y<arr.length;y++){
                list.add(arr[y]);
            }
        }

        while(start < end ){
            mid = (start + end)/2;
            if(arr[mid]==x){
                s= mid;
                break;
            }
            else if(arr[mid]>x){
                end = mid;
            }
            else{
                start = mid+1;
                s = mid;
            }
        }
        if(x - arr[s] > arr[end] - x )
            s= end;
        list.add(arr[s]);
        int i = s-1;
        int j = s+1;
        while(i!=-1 && j<arr.length){
            if(list.size()<k){
                // list.add(min(arr[i],arr[j]));
                if(x-arr[i]>arr[j]-x){
                    list.add(list.size(),arr[j]);
                    j++;
                }
                else{
                    list.add(0,arr[i]);
                    i--;
                }
            }
            else
                return list;
        }
        if(i==-1){
            while(list.size()<k){
                list.add(list.size(),arr[j]);
                j++;
            }
        }
        if(j==arr.length){
            while(list.size()<k){
                list.add(0,arr[i]);
                i--;
            }
        }
        // collections.sort(list);
        return list;
    }
}

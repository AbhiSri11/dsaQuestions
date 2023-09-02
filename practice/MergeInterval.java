package com.practice;
import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] arr = {{1,4},{4,5}};
        //int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i=0;
        int count=1;
        int j=1;
        while(i<arr.length){
            if(i<arr.length-1 && arr[i][1]>arr[j][0]){
                arr[i][1] = Math.max(arr[i][1],arr[i+1][1]);
                count++;
                j++;
            }
            else{
                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(arr[i][0]);
                list2.add(arr[i][1]);
                list.add(new ArrayList<>(list2));
                i+=count;
                j=i+1;
                count=1;
            }
        }
        int[][] arr2 = new int[list.size()][2];
        for(j=0;j<list.size();j++){
            arr2[j][0] = list.get(j).get(0);
            arr2[j][1] = list.get(j).get(1);
        }
        for(int p=0;p<arr2.length;p++){
            System.out.println(arr2[p][0] + " " + arr2[p][1]);
            System.out.println();
        }
    }
}

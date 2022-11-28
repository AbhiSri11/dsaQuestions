package com.company;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[]arr ={4,0,3,2};
       int ans =cyclic(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int cyclic(int[] arr){
        int i=0;
        int n=arr.length;
        while( i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
                i++;
        }
        for(int index=0;index<arr.length;index++)
            if(arr[index]!=index)
                return index;
        return arr.length;
    }
}

package com.Leetcode;
import java.util.*;
public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,3,5,7,8,9,5};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;
    }
//    int n = arr.length-1;
//        for(int i=0;i<arr.length;i++){
//        for(int j=1;j<arr.length-i;j++){
//            if(arr[j]<arr[j-1]){
//                int temp =arr[j-1];
//                arr[j-1]=arr[j];
//                arr[j]=temp;
//            }
//        }
//    }
}
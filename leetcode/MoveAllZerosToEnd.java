package com.leetcode;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr ={15, 12, 0, 0, 0, 2, 2, 19, 6, 17, 16, 20, 0, 2, 16, 0, 10, 0, 14, 15};
        int n =20;
        pushZerosToEnd(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void pushZerosToEnd(int arr[], int n) {
        // code here
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] != 0) {
                i++;
                j++;
            } else if (arr[i] == 0) {

                if (arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
                else {
                    j++;
                }
            }
        }
    }
}

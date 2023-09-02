package com.leetcode3;

import java.util.Arrays;

public class FindTheDivisibilityOfArray {
    public static void main(String[] args) {
        String word = "1010";
        int m = 10;
        int[] arr = new int[word.length()];
        int count = 0;
        int i=0;
        while(i<word.length()){
            count = count*10 + (int)word.charAt(i);
            if(count%m == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

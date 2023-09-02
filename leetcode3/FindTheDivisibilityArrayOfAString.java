package com.leetcode3;

import java.util.Arrays;

public class FindTheDivisibilityArrayOfAString {
    public static void main(String[] args) {
        String word = "998534723491233";
        int m = 3;
        int[] arr = new int[word.length()];
        long count = 0;
        int i=0;
        while(i<word.length()){
            count = (count*10 + (int)word.charAt(i)-48)%m;
            if(count == 0){
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

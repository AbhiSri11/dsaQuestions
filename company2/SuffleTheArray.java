package com.company2;
import java.util.*;
public class SuffleTheArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int[] ans =shuffle(arr,3);
        System.out.println(ans);
    }
    static int[] shuffle(int[] nums, int n) {
        int [] new2 = new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            new2[j]=nums[i];
            j++;
            new2[j]=nums[n+i];
            j++;
        }
        return new2;
    }
}

package com.leetcode2;
import java.util.*;
public interface ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        int [] ans = replaceElements(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] replaceElements(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     if(i==arr.length-1)
        //         arr[i]=-1;
        //     else{
        //         int max = arr[i+1];
        //         for(int j =i+1;j<arr.length;j++){
        //             max = Math.max(max,arr[j]);
        //         }
        //         arr[i]=max;
        //     }
        // }
        //     return arr;

        //  ***********   2nd METHOD   ***********  //

        int Maxso = arr[arr.length-1];
        arr[arr.length-1]=-1;
        if(arr.length==1)
            return arr;
        for(int i=arr.length-2;i>=0;i--){
            int temp = arr[i];
            arr[i]=Maxso;
            Maxso=Math.max(Maxso,temp);
        }
        return arr;
    }

}

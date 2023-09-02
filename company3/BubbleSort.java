package com.company3;

//import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //System.out.println(Array.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
//        Isme jb hum ek pass complete hoga to largest wala apne jagah pr aa jayega 2nd pass me 2nd largest and so on.
//        Stable hota hai
//        Time Complexity:-
//        1- Best Case - O(n) -  When the array is sorted already.
//        1- Worst Case - O(n2) -  When the array is sorted in opposite.
//        1- Avg Case - O(n2) -  In normal cases.
//        Space Compexity - O(1)
    }

}

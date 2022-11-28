package com.leetcode2;
import java.util.*;
public class StockSpamProblem {
    public static void main(String[] args) {
        int [] arr = {68, 735, 101, 770, 525, 279, 559, 563, 465, 106, 146, 82, 28, 362, 492, 596, 743, 28, 637, 392, 205, 703, 154, 293, 383, 622, 317, 519, 696, 648, 127, 372, 339, 270, 713, 68, 700, 236, 295, 704, 612, 123};
        int[] ans = calculateSpan(arr,42);
        System.out.println(Arrays.toString(ans));
    }
    static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int s=1;
            if(st.size()==0){
                arr[i]=1;
            }
            else if(st.size() > 0){
                if(price[i-1] <= price[i]){
                    arr[i] = arr[i-1]+1;
                }
                else{
                    arr[i] = 1;
                }
            }
            st.push(price[i]);
        }
        return arr;
    }
}

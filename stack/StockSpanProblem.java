package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85};
        int[] ans = span(arr);
        System.out.println(Arrays.toString(ans));
    }
   static class Pair{
        int key;
        int val;
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    static int[] span(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Pair> st = new Stack<>();
        for (int i =0 ; i < arr.length; i++) {
            if (st.size() == 0) {
                ans[i] = -1;
            } else if (st.size() > 0 && st.peek().key > arr[i])
                ans[i] = st.peek().val;
            else if (st.size() > 0 && st.peek().key <= arr[i]) {
                while (st.size() > 0 && st.peek().key <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0)
                    ans[i] = -1;
                else
                    ans[i] = st.peek().val;
            }
            Pair neu= new Pair(arr[i],i);
            st.push(neu);
        }
        for(int i=0;i<arr.length;i++){
            ans[i]= i-ans[i];
        }
        return ans;
    }
}

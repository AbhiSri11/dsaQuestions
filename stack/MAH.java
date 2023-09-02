package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class MAH {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        int[] ans = mah(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mah(int[] arr){
        int[] right = new int[arr.length];
        int[] left = new int[arr.length];
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                right[i]=arr.length;
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                right[i]=i;
            }
            else if(st.size()>0 && st.peek()>=arr[i]){
                while(st.size()>0 && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    right[i]=arr.length;
                else
                    right[i]=i;
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(right));
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                left[i]=-1;
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                left[i]=i;
            }
            else if(st.size()>0 && st.peek()>=arr[i]){
                while(st.size()>0 && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    left[i]=-1;
                else
                    left[i]=i;
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(left));
        for(int i=0;i<arr.length;i++){
            ans[i]= left[i]-right[i]-1;
        }
        return ans;
    }
}
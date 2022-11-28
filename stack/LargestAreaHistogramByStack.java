package com.stack;
import java.util.*;

// isme abhi change karna hai pair banake karna hai

public class LargestAreaHistogramByStack {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3,1};

        Stack<Integer> st = new Stack<>();

        int[] right = new int[arr.length];
        int[] left = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                left[i] = -1;
            }
            else if(st.size()>0 && st.peek()  < arr[i]){
                left[i]=st.peek();
            }
            else if(st.size()>0 && st.peek() >= arr[i]){
                while(st.size()>0 && st.peek() >= arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    left[i] = -1;
                else
                    left[i]=st.peek();
            }
            st.push(arr[i]);
        }

        while(st.size()!=0)
            st.pop();

        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                right[i] = -1;
            }
            else if(st.size()>0 && st.peek()  <arr[i]){
                right[i]=st.peek();
            }
            else if(st.size()>0 && st.peek() >= arr[i]){
                while(st.size()>0 && st.peek() >= arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    right[i] = -1;
                else
                    right[i]=st.peek();
            }
            st.push(arr[i]);
        }

        int max = 0;

//        for(int i=0;i<arr.length;i++){
//            right[i]=right[i]-left[i]+1;
//            right[i]=right[i]*arr[i];
//            if(max<right[i])
//                max=right[i];
//        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(max);

    }
}

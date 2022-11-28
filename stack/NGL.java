package com.stack;
import java.util.Arrays;
import java.util.Stack;
public class NGL {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 9, 0, 7};
        int[] ans = ngr(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ngr(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i =0 ; i < arr.length; i++) {
            if (st.size() == 0) {
                ans[i] = -1;
            } else if (st.size() > 0 && st.peek() > arr[i])
                ans[i] = st.peek();
            else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0)
                    ans[i] = -1;
                else
                    ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
package com.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s = "Mohan";
        Stack<Character> st = new Stack<>();
        char[] stt = s.toCharArray();
        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }
        while(st.size()!=0)
            System.out.print(st.pop());
    }
}

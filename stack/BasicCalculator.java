package com.stack;

import java.util.Stack;
//galat hai
public class BasicCalculator {
    public static void main(String[] args) {
        String s = "1+1";
        int p = calculate(s);
        System.out.println(p);
    }
    static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int i=0;int j=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                i++;
                continue;
            }
            if(s.charAt(i)=='+'){
                int sum = st.peek()+s.charAt(i+1);
                st.pop();
                i++;
                st.push(sum);
            }
            else if(s.charAt(i)=='-'){
                int diff = st.peek()-s.charAt(i+1);
                st.pop();
                i++;
                st.push(diff);
            }
            else{
                int a = s.charAt(i)-48;
                j=i;
                st.push(a);
            }
            i++;
        }
        return st.peek();
    }
}

package com.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s= "){";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
    static boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            switch(c){
                case '(': stack.push(c);
                   break;
                case '{': stack.push(c);
                    break;
                case '[': stack.push(c);
                    break;
                case ')':
                    if(stack.peek() =='(')
                        stack.pop();
                    else
                        return false;
                    break;
                case '}':
                    if(stack.peek() =='{')
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if(stack.peek() =='[')
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }
        if(stack.size()==0)
            return true;
        return false;
    }
}

package com.stack;

public class StackUsingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int top =-1;
        //if want to push (add) element in Stack
        arr[++top]=3;
        arr[++top]=56;
        arr[++top]=5;
        int size = top+1;
        System.out.println("size is " + size);
        //if we wnt to pop (delete) element from stack
        top--;
        //display element from stack
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}

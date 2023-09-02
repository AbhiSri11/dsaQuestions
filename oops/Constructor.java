package com.oops;
class pair{
    int key;
    int val;
    public pair(int key,int val){
        this.key = key;
        this.val = val;
    }
}
public class Constructor {
    public static void main(String[] args) {
        pair obj = new pair(0,0);
        System.out.println(obj.key+" " + obj.val);
    }
}

package com.practice;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = generate(5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            if(i==1){
                arr.add(1);
            }
            else if(i==2){
                arr.add(1);
                arr.add(1);
            }
            else{
                arr.add(1);
                int j=1;
                while(j<i-1){
                    int p = list.get(list.size()-1).get(j-1);
                    int q =  list.get(list.size()-1).get(j);
                    int r = p+q;
                    arr.add(r);
                    j++;
                }
                arr.add(1);
            }
            list.add(new ArrayList<>(arr));
        }
        return list;
    }
}

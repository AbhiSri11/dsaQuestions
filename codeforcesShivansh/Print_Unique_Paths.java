package com.codeforcesShivansh;
import java.util.*;
public class Print_Unique_Paths {
    public static void main(String args[]){
        int m=3;
        int n=7;
        List<String> list=new ArrayList<String>();
        AllPaths(m-1,n-1,list);
        System.out.println(list);
    }
    public static void AllPaths(int i,int j,List<String> list){
        if(i==0 && j==0){
            System.out.println(list);
        }
        if(i<0 || j<0) return;
        list.add("up");
        AllPaths(i-1,j,list);
        list.remove(list.size()-1);
        list.add("left");
        AllPaths(i,j-1,list);
        list.remove(list.size()-1);
    }
}

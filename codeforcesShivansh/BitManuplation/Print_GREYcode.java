package com.codeforcesShivansh.BitManuplation;
import java.util.*;
public class Print_GREYcode {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        List<String> list=new ArrayList<>();
        list=PrintG(x);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            ans.add(Integer.parseInt(list.get(i),2));
        }
        System.out.println(ans);
    }
    public static List<String> PrintG(int n){
       if(n==1) {
           List<String> list = new ArrayList<String>();
           list.add("0");
           list.add("1");
           return list;
       }
       List<String> res=PrintG(n-1);
       List<String> my_res=new ArrayList<>();
       for(int i=0;i<res.size();i++){
           my_res.add("0"+res.get(i));
       }
       for(int i=res.size()-1;i>=0;i--){
           my_res.add("1"+res.get(i));
       }
       return my_res;
    }
}

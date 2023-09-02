package com.company;

import java.util.Scanner;

public class ConstructString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //while(t-->0){
            //int n = 6;
            String s = "abcd";
            String p = "";
            int i=0;
            while(i<s.length()){
                int count=0;
                int z = i;
                while(i<s.length() && s.charAt(z)==s.charAt(i)){
                    count++;
                    i++;
                }
                if(count==0){
                    i++;
                    continue;
                }
                if(count%2==0){
                    p = p + s.charAt(z) + s.charAt(z);
                }
                else{
                    p=p+s.charAt(z);
                }
            }
            System.out.println(p);
        //}
    }
}

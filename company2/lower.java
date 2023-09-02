package com.company2;
import java.util.*;

import static java.lang.Character.toLowerCase;

public class lower {
    public static void main(String[] args) {
        String str = "UPER";
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(i==1){
                char p = toLowerCase(str.charAt(i));
                ans = ans + p;
            }
            else{
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

package com.Gfg;

import java.util.Arrays;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String line = "dgaijvwcyaubwewpjvygehljxe";
        char[] temp = line.toCharArray();
        Arrays.sort(temp);
        int count = 1;
        int max = 0;
        char c = temp[0];
        for(int i=0;i<line.length()-1;i++){
            if(temp[i]==temp[i+1]){
                count++;
                if(max<count){
                    max = count;
                    c = temp[i];
                }
            }
            else{
                count = 1;
            }
        }
        System.out.println(c);
    }
}

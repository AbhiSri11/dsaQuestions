package com.Gfg;

public class SumOfTwoLargeNumbers {
    public static void main(String[] args) {
        String x = "25";
        String y= "23";
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = x.length()-1;
        int j = y.length()-1;
        while(i>=0 && j>=0){
            String p = ""+x.charAt(i--);
            String q = ""+y.charAt(j--);
            int fir = Integer.parseInt(p);
            int sec = Integer.parseInt(q);
            int sum = fir + sec + carry;
            sb.insert(0,sum%10);
            carry = sum/10;
        }
        while(i>=0){
            String p = ""+x.charAt(i--);
            int fir = Integer.parseInt(p);
            int sum = fir + carry;
            sb.insert(0,sum%10);
            carry = sum/10;
        }
        while(j>=0){
            String p = ""+y.charAt(j--);
            int fir = Integer.parseInt(p);
            int sum = fir + carry;
            sb.insert(0,sum%10);
            carry = sum/10;
        }
        if(carry==1)sb.insert(0,1);
        String p = "0";
        while(true && sb.length()>1) {
            if(sb.charAt(0)=='0')sb.deleteCharAt(0);
            else break;
        }
        System.out.println(sb.toString());
    }
}

package com.practice;

public class RemoveString {
    public static void main(String[] args) {
        String s = "e appleakkaka is hanzhaz nssbxja ";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        remove(0,0,s,"apple",sb,sb1);
        System.out.println(sb);
    }
    public static void remove(int i, int j, String s, String s1,StringBuilder sb,StringBuilder sb1){
        if(i==s.length()) return;
        if(j<s1.length() && s1.charAt(j)==s.charAt(i)){
            sb1.append(s1.charAt(j));
            remove(i+1,j+1,s,s1,sb,sb1);
        }
        else{
            if(sb1.equals(s1)) sb = sb.append(sb1);
            sb1 = new StringBuilder();
            sb.append(s.charAt(i));
            remove(i+1,0,s,s1,sb,sb1);
        }
    }
}

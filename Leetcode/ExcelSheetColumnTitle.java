package com.Leetcode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n=701;
        String ans =convertToTitle(n);
        System.out.println(ans);

    }
    static String convertToTitle(int columnNumber) {
        StringBuilder str= new StringBuilder();
        while(columnNumber!=0){
            if(columnNumber%26==0){
                str.insert(0,'Z');
            }
            else {
                char result = (char) (columnNumber % 26 + 'A' - 1);
                str.insert(0, result);
            }
            columnNumber=columnNumber/26;
        }
        return str.toString();
    }
}

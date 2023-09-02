package com.recursion;

public class StringWithoutA {
    public static void main(String[] args) {
        String arr="baccabdwbebshxhsjd";
        String arr2="";
        main(arr,arr2);
    }
    static void main(String arr,String arr2){
        if(arr.isEmpty()) {
            System.out.println(arr2);
            return;
        }
        char ch = arr.charAt(0);
        if(ch!='a'){
            arr2=arr2+ch;
            main(arr.substring(1),arr2);
        }
        else{
            main(arr.substring(1),arr2);
        }

    }
}

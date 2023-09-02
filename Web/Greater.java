package com.Web;

public class Greater {
    public static void main(String[] args) {
        //Question 6

        int h = 3;
        int i = 7;
        int j = 9;
        if(h>i && h>j) {
            System.out.println(h + " is greatest");
        }
        else if(i>j && i>h){
            System.out.println(i + " is greatest");
        }
        else{
            System.out.println(j + " is greatest");
        }
    }
}

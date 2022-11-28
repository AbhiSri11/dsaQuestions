package com.company2;

public class Strings {
    public static void main(String[] args) {
        String firstName = "Abhinav";
        String lastName = "Srivastava";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i)+ " ");
        }
    }
}

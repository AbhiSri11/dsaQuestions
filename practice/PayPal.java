package com.practice;

public class PayPal {
    public static void main(String[] args) {
        String[] password = {"1234","iliketoCode","teaMAKEmehappy"};
        int i=0;
        int lower = 0;
        int upper = 0;
        int count=0;
        for(int j=0;j<password.length;j++) {
            while (i < password[j].length()) {
                if(password[i].length()<6){
                    System.out.println("weak");
                    break;
                }
                if (Character.isDigit(password[j].charAt(i))) {
                    count++;
                } else if (password[j].charAt(i) >= 97 && password[j].charAt(i) <= 122) {
                    lower++;
                } else if (password[j].charAt(i) >= 65 && password[j].charAt(i) <= 90) {
                    upper++;
                }
                i++;
            }
            if (count == password[j].length() || lower == password[j].length() || upper == password[j].length()) {
                System.out.println("waek");
                break;
            }
            i = 0;
            count = 0;
            lower = 0;
            upper = 0;
            System.out.println(Stringmatch("iamhapswhapp","happy"));
        }

    }
     static boolean  Stringmatch(String s1,String s2){
        int i=0;
        int j=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(0)){
                for(j=0;j<s2.length();j++){
                    if(s1.charAt(i++)!=s2.charAt(j)) break;
                }
                if(j==s2.length()) return true;
            }
            i++;
        }
        return true;
    }
}

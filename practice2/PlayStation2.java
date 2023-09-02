package com.practice2;

public class PlayStation2 {
    public static void main(String[] args) {
        String s1 = "John";
        String s2 = "Johny";
        String s3 = "Janardhan";

        String[] arr = new String[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        String ans1 = "";
        String ans2 = "";
        String ans3 = "";

        for (int i = 0; i < 3; i++) {
            String s11 = "";
            String s12 = "";
            String s13 = "";
            if (arr[i].length() % 3 == 1) {
                s11 = arr[i].substring(0, arr[i].length() / 3);
                s12 = arr[i].substring(arr[i].length() / 3, 2 * (arr[i].length() / 3) + 1);
                s13 = arr[i].substring(2 * (arr[i].length() / 3) + 1, arr[i].length());
                ans1 = ans1 + s11;
                ans2 = ans2 + s12;
                ans3 = ans3 + s13;
            } else if (arr[i].length() % 3 == 2) {
                s11 = arr[i].substring(0, arr[i].length() / 3 + 1);
                s12 = arr[i].substring(s1.length() / 3 + 1, 2 * (arr[i].length() / 3) + 1);
                s13 = arr[i].substring(2 * (s1.length() / 3) + 1, arr[i].length());
                ans1 = ans1 + s13;
                ans2 = ans2 + s11;
                ans3 = ans3 + s12;
            } else if (arr[i].length() % 3 == 0) {
                //if()

                s11 = arr[i].substring(0, arr[i].length() / 3);
                s12 = arr[i].substring(arr[i].length() / 3, 2 * (arr[i].length() / 3));
                s13 = arr[i].substring(2 * (arr[i].length() / 3), arr[i].length());

                ans1 = ans1 + s12;
                ans2 = ans2 + s13;
                ans3 = ans3 + s11;


            }
        }
        char[]Ans3=ans3.toCharArray();
        for (int i = 0; i < ans3.length(); i++) {
            if (Character.isUpperCase(ans3.charAt(i))) {
                Ans3[i]=Character.toLowerCase(ans3.charAt(i));
            }
            else if (Character.isLowerCase(ans3.charAt(i))) {
                Ans3[i]=Character.toUpperCase(ans3.charAt(i));
            }
        }
        System.out.println(ans1+" "+ans2+" ");
        String s5 = "";
        for(int i=0;i<Ans3.length;i++) {
            s5 = s5 + Ans3[i];
        }
        System.out.println(s5);
    }
}

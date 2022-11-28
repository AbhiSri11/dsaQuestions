package com.practice;

import java.sql.SQLOutput;

public class IBM {
    public static void main(String[] args) {
        String s = "000001001011101010010110011";
        decode(s);
    }
    static void decode(String binary){
        if(binary.charAt(0)=='0' && binary.charAt(0)=='0' && binary.charAt(0)=='0'){
            for(int i =3; i<binary.length();i=i+3){
                if(binary.charAt(i)=='0' && binary.charAt(i+1)=='0' && binary.charAt(i+2)=='1'){
                    System.out.print("C");
                }
                else if(binary.charAt(i)=='0' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='0'){
                    System.out.print("G");
                }
                else if(binary.charAt(i)=='0' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='1'){
                    System.out.print("A");
                }
                else if(binary.charAt(i)=='1' && binary.charAt(i+1)=='0' && binary.charAt(i+2)=='1'){
                    System.out.print("T");
                }
                else if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='0'){
                    System.out.print("T");
                }
            }
        }
        else if(binary.charAt(0)=='1' && binary.charAt(0)=='1' && binary.charAt(0)=='1'){
            for(int i =3; i<binary.length();i=i+3){
                if(binary.charAt(i)=='0' && binary.charAt(i+1)=='0' && binary.charAt(i+2)=='1'){
                    System.out.print("C");
                }
                else if(binary.charAt(i)=='0' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='0'){
                    System.out.print("G");
                }
                else if(binary.charAt(i)=='0' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='1'){
                    System.out.print("A");
                }
                else if(binary.charAt(i)=='1' && binary.charAt(i+1)=='0' && binary.charAt(i+2)=='1'){
                    System.out.print("U");
                }
                else if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1' && binary.charAt(i+2)=='0'){
                    System.out.print("U");
                }
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

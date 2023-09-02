package com.leetcode4;

import java.util.HashSet;

public class Q468 {
    public static void main(String[] args) {
        String ip = "201:db8:85a3:0:0:8a2E:0370:7334";
        int count =0;
        boolean flag = true;
        for(int i=0;i<5;i++){
            if(ip.charAt(i)=='.') break;
            else if(ip.charAt(i)==':'){
                flag = false;
                break;
            }
            else if(i==4) System.out.println("Neither100");
        }

//        if(flag) {
//            HashSet<Integer> hash = new HashSet<>();
//            for (int i = 0; i < 256; i++) hash.add(i);
//
//            for (int i = 0; i < ip.length(); i++) {
//                if (ip.charAt(i) == '.') System.out.println("neighter2");
//                String p = "";
//                if (i != ip.length() - 1 && ip.charAt(i) == '0' && ip.charAt(i + 1) != '.') System.out.println("neighter3");
//                if (ip.charAt(i)>122) System.out.println("neighter4");
//                while (i < ip.length() && ip.charAt(i) != '.') {
//                    if (!hash.contains(ip.charAt(i))) System.out.println("neighter5");
//                    p = p + ip.charAt(i++);
//                }
//                int ans = Integer.parseInt(p);
//                if (!hash.contains(ans)) {
//                    System.out.println("neighter6");
//                }
//            }
//        }
//        System.out.println("neighter7");
        count = 0;
        HashSet<Character> hash = new HashSet<>();
        for(int i=48;i<58;i++) hash.add((char)i);
        for(int i=65;i<71;i++) hash.add((char)i);
        for(int i=97;i<103;i++) hash.add((char)i);
        for(int i=0;i<ip.length();i++){
            if(ip.charAt(i)==':') {
                count++;
            }
        }
        if(count!=7 ) System.out.println("neighter1");
        for(int i=0;i<ip.length();i++){
            if(ip.charAt(i)==':') System.out.println("neighter2");
            if(!hash.contains(ip.charAt(i))) System.out.println("neighter3");
            int z = 0;
            while(i<ip.length() && ip.charAt(i)!=':'){
                if(!hash.contains(ip.charAt(i))) System.out.println("neighter4");
                z++;
                if(z==5) System.out.println("neighter5");
                i++;
            }
        }
        System.out.println("Ip");
    }
}

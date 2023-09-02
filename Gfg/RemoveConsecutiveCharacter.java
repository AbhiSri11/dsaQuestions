package com.Gfg;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String a = "lfoajnippckfilmebjffjdacopakmhfbfagnoekojnaieolalehfdonhlpomflkcjhbkmknnciaehfbgliklmjhfmpmjpgcghcnkjfgcmbhcinljcncbmmhedboffhnnogmhfehdcfhlidohlffppmjccafimiigngfbmcdphcdgghcalijlnhmhpkoaogodmpoofpfdbdnakhkdkmekioemmbnaifbjddcgeheoehfefcjjnjmhdpfapgeifgdelgnghkhcjlfbajbldlnnpciofpplkididngalglikambfgpbojioamkaflmecccbpffchepgahbfhnfmnhlkhkfllniacehdmpfdklokdphjgmcgpfaajlkieojhffipeegjodcmfcbnmgfpenhfembheleahdgfiplbobifeimamepfeclbokjpklanpaanaiidmnaiploieogbpdfnokpjflknhjfcbgcfojiokjfohmkjdbmcceanjanhbcdocglbkgjaefejaejimpkidejkihjiedhghmoilofcijfoabnkcbjjbbahlpnigppkoniccjlclhgnpfaobmkfclijllafie";
        int b=1;
        char[] arr = a.toCharArray();
        int i=1;
//        if(b==1) {
//            while (i < a.length()) {
//                if(a.charAt(i)!=a.charAt(i-1)){
//                    arr[i-1]='-';
//                }
//                i++;
//            }
//        }
        //else {
            i = 1;
            while (i < a.length()) {
                int count = 1;
                //System.out.println(a.charAt(i)+" "+a.charAt(i-1));
                while (i <= a.length() && a.charAt(i) == a.charAt(i - 1)) {
                    count++;
                    i++;
                }
                if (count == b) {
                    int p = i - 1;
                    while (count-- > 0) {
                        arr[p--] = '-';
                    }
                }
                i++;
            }
        //}
        if(b==1 && a.charAt(a.length()-1) != a.charAt(a.length()-2)) arr[a.length()-1]='-';
        String s = "";
        for(int p=0;p<arr.length;p++){
            if(arr[p] == '-')continue;
            s = s +  arr[p];
        }

        System.out.println(s);
    }
}

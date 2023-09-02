package com.company2;

public class StringLinearSearch {
    public static void main(String[] args) {
        String name ="Abhinav";
        char target= 'd';
        boolean ans=search(name,target);
        System.out.println(ans);

    }
    static boolean search(String name, char target)
    {
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++)
        {
            if(target==name.charAt(i))
                return true;
        }
        return false;

    }
}

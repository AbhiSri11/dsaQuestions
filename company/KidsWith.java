package com.company;
import java.util.*;
import java.util.ArrayList;
public class KidsWith {
    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3};
        int extraCandies = 3;
        ArrayList<Boolean> ans = new ArrayList<>();
      //  ans = kidsWithCandies(candies,extraCandies);

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}

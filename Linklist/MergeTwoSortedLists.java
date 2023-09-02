package com.Linklist;

import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        int i=0;
        int j=0;

        LinkedList<Integer> list3 = new LinkedList<>();
        while(i<list.size() && j<list2.size()){
            if(list.get(i)>=list2.get(j)){
                list3.add(list2.get(j));
                j++;
            }
            else if(list.get(i)<list2.get(j)){
                list3.add(list.get(i));
                i++;
            }
        }
        if(i!=list.size()){
            while(i<list.size()){
                list3.add(list.get(i));
                i++;
            }
        }
        if(j!=list2.size()){
            while(j<list2.size()){
                list3.add(list2.get(j));
                j++;
            }
        }
        System.out.println(list3);
    }
}

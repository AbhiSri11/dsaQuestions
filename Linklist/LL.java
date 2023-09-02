package com.Linklist;
import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);
        list.addFirst(8);
        list.remove(2);
        System.out.println(list);
        // for size of linkedlist
        System.out.println(list.size());
        //for itation of the linkedlist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

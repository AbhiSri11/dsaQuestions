package com.leetcode2;
public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
//    static LinkedList reverseList(LinkedList head) {
//        LinkedList head2 = head;
//        LinkedList head3 = head.next;
//        LinkedList head4 = head3;
//        while(head4.next != null){
//            head3 = head4;
//            head2 = head3;
//            head3 = head2;
//            head4 = head.next;
//        }
//        head = head4;
//        head4.next=null;
//        return head;
//    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        printList(list);
    }
}


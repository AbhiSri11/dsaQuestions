package com.Linklist;

public class LinkedListImplementation {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    Node head;
    // Add At First Index
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    // Add At Last Index
    public void addLast(int data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    // Print The LinkedList
    public void printlist(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        return;
    }
    // delete the node of the linkedlist
    public void delete(int data){
        if(head == null){
            System.out.println("wrong");
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next.data != data){
            temp = temp.next;
            if(temp.next == null){
                System.out.println("wrong");
                return;
            }
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();list.addFirst(2);
        list.addFirst(5);
        list.addLast(1);
        list.delete(2);
        list.printlist();
    }
}

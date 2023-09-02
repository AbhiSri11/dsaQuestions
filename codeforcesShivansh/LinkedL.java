//package com.codeforcesShivansh;
//
//public class LinkedL {
//    //List_Node head;
//    class List_Node{
//        int data;
//        List_Node next;
//
//         List_Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    List_Node head;
//    public void addFirst(int data){
//        List_Node node=new List_Node(data);
//        if(head==null){
//            head=node;
//            return;
//        }
//        node.next=head;
//        head=node;
//
//    }
//    public void  addLast(int data){
//        List_Node node=new List_Node(data);
//        if(head==null){
//            head=node;
//        }
//        List_Node temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=node;
//        return;
//    }
//    public static void PrintList() {
//        if (head == null) {
//            System.out.println("The List is empty");
//            return;
//        }
//        List_Node temp = head;
//        while (temp.next != null) {
//            System.out.print(temp.data + "->");
//        }
//        System.out.print("null");
//    }
//    public static void removeLoop(Node head){
//        Node fast=head,slow=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                int length=0;
//                length=Length_Cycle(slow);
//
//                Node start=Start_of_Cycle(length,head);
//                length-=1;
//                while(length-->0){
//                    start=start.next;
//                }
//                start.next=null;
//            }
//        }
//    }
//    public static int Length_Cycle(Node slow){
//        Node temp=slow;
//        int length=0;
//        do{
//            temp=temp.next;
//            length++;
//        }while(temp!=slow);
//        return length;
//    }
//    public static Node Start_of_Cycle(int length,Node head){
//        Node second=head;
//        Node first=head;
//        while(length-->0){
//            second=second.next;
//        }
//        while(first!=second){
//            first=first.next;
//            second=second.next;
//        }
//        return second;
//    }
//    public static void main(String args[]){
//        LinkedL node=new LinkedL();
//        node.addFirst(2);
//        node.addFirst(3);
//        PrintList();
//    }
//}

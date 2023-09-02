package com.codeforcesShivansh;

public class ListNode {
    class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node head=null;
    public void insert(int data){
        if(head == null) {
            Node newnode=new Node(data,null);
            head=newnode;
        }else{
            Node newnode=new Node(data,null);
            Node temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=newnode;
        }
    }
    public void insertFirst(int data){
        if(head==null){
            Node newnode=new Node(data,null);
            head=newnode;
        }else {
            Node newnode = new Node(data, null);
            newnode.next = head;
            head = newnode;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("Head is null");
        }else{
            Node temp=head;
            while(temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public void delete(int data){
        if(head == null){
            System.out.println("wrong");
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node temp=head;
        while(temp.next.data != data){
            temp = temp.next;
            if(temp.next == null){
                System.out.println("wrong");
                return;
            }
        }
        temp.next = temp.next.next;
    }
    public boolean isCycle(){
        if(head==null || head.next==null) return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    public Node isCycleNode(){
        if(head==null || head.next==null) return head;
        if(isCycle()==false) return null;
        Node slow=head.next;
        Node fast=head.next.next;
        while(fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=head;
        while(slow!=temp){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
    public void Reverse(Node start){
        if(start==null || start.next==null) return;
        else{
            Node prev=new Node(-1,start);
            Node cur=start;
            Node next=start.next;
            while(cur!=null){
                cur.next=prev;
                prev=cur;
                cur=next;
                if(next!=null) next=next.next;
            }
            head=prev;
        }
    }
    public Node Middle(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
       else{
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    }
    public void Rotate(int k) {
        if (head == null || head.next == null || k == 0) return;
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        temp.next = head;
        temp = head;
        k = k % length;
        int i = 0;
        while (i < length - (k + 1)) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
    }


    // Coaching Practice Questions
    // 1. remove 'K' from the linked list.
    // 2. reverse in k group
    public void removeK(int k){
        if(head==null) return;
        while(head.data==k) head=head.next;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==k) temp.next=temp.next.next;
            else{
                temp=temp.next;
            }
        }
    }



    public static void main(String[] args) {
        ListNode node=new ListNode();
        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);
        node.print();
        node.removeK(5);
        node.removeK(1);
        node.print();
        //node.Rotate(2);
        //node.print();
    }
}

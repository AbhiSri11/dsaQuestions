package com.Linklist;

// Reverse the LinkedList
// Remove Nth element from the last
// Find the middle element

public class ReverseALinkedList {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data= data;
            this.next = null;
        }
    }
    static ListNode head;
    public void addFirst(int data){
        ListNode newNode =new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public void addLast(int data){
        ListNode newNode =new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
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
        ListNode temp = head;
        while(temp.next.data != data){
            temp = temp.next;
            if(temp.next == null){
                System.out.println("wrong");
                return;
            }
        }
        temp.next = temp.next.next;
    }

    // Print The LinkedList
    public void printlist(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
        return;
    }

    public static void main(String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.reverse(head);
        //list.removeNthFromEnd(head,2);
        //System.out.println(list.middleNode(head).data);
        list.printlist();
    }

    // Find the middle element
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Remove Nth element from the last
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode temp = head;
        int size =0;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        temp =head;
        for(int i=0;i<size-n-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // Reverse the LinkedList
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
//        ListNode prev = null;
//        ListNode curr = head;
//        ListNode next = curr.next;
//        while(curr != null){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            if(next != null) {
//                next = next.next;
//            }
//        }
//        head = prev;
//        return head;
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}

package com.practice;
import com.sun.source.tree.BinaryTree;
import org.w3c.dom.Node;

import java.util.*;
//public class Tree {
//    static class node{
//        int value;
//        node left;
//        node right;
//        node(int p){
//            data = p;
//            left = null;
//            right = null;
//        }
//    }
//    void insert(Node node, int value) {
//        if (value < node.value) {
//            if (node.left != null)
//            {
//                insert(node.left, value);
//            }
//            else {
//                System.out.println(" Inserted " + value + " to left of " + node.value);
//                node.left = new Node(value);
//            }
//        }
//        else if (value > node.value) {
//            if (node.right != null) {
//                insert(node.right, value);
//            }
//            else {
//                System.out.println("  Inserted " + value + " to right of "
//                        + node.value);
//                node.right = new Node(value);
//            }
//        }
//    }
//    void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//    }
//}

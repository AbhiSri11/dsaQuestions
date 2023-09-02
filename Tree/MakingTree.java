package com.Tree;

import java.util.LinkedList;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int key){
        data = key;
    }
}
public class MakingTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
//        root.left.left = new TreeNode(15);
//        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
//        System.out.println(root.left.data);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = levelOrder(root);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static  ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            qu.add(null);
            ArrayList<Integer> list2 = new ArrayList<>();
            while (qu.peek() != null) {
                TreeNode tree = qu.poll();
                if (tree.left != null) qu.add(tree.left);
                if (tree.right != null) qu.add(tree.right);
                list2.add(tree.data);
            }
            list.add(new ArrayList<>(list2));
            qu.poll();
        }
        return list;
    }

}

package com.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    public TreeNode1(int key){
        val = key;
    }

}
public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.right.left = new TreeNode1(4);
        root.right.right = new TreeNode1(5);
        serialize(root);
    }
    public static String serialize(TreeNode1 root) {
        if(root==null) return "";
        ArrayList<ArrayList<Character>> list = new ArrayList<>();

        Queue<TreeNode1> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            //qu.add(null);
            int size = qu.size();
            ArrayList<Character> list2 = new ArrayList<>();
            int j=0;
            while(j<size){
                TreeNode1 curr = qu.remove();
                if(curr!=null){
                    if(curr.left!=null){
                        qu.add(curr.left);
                        int p = curr.left.val + '0';
                        char c = (char)p;
                        list2.add(c);
                        //System.out.println(c);
                    }
                    else list2.add('N');
                    if(curr.right!=null){
                        qu.add(curr.right);
                        int p = curr.right.val + '0';
                        char c = (char)p;
                        list2.add(c);
                    }
                    else list2.add('N');
                }
                j++;
            }
            list.add(new ArrayList<>(list2));
        }
        ArrayList<Character> list2 = new ArrayList<>();
        int p = root.val + '0';
        char c = (char)p;
        list2.add(c);
        list.add(0,list2);
        list.remove(list.size()-1);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        String[] arr = new String[1];

        return arr[0];
    }
}

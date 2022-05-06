import java.util.*;
import java.lang.*;
import java.io.*;

class LeftView {
    static class Node {
        Node left;
        int val;
        Node right;
    }

    static Node insertTree(Node root, int val) {        
        if (root == null) {
            Node node = newNode(val);
            return node;
        }
        if (root.val > val)
            root.left = insertTree(root.left, val);
        if (root.val < val)
            root.right = insertTree(root.right, val);
        return root;
    }

    static Node newNode(int val) {
        Node node = new Node();
        node.val = val;
        node.left = null;
        node.right = null;
        return node;
    }

    static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    static void rightView(Node root){
        if(root==null) 
            return;
        System.out.print(root.val+" ");
        if (root.right == null)
            rightView(root.left);
        else
            rightView(root.right);
    }
    
    static void leftView(Node root){
        if(root==null) 
            return;
        System.out.print(root.val+" ");
        if(root.left==null)
          leftView(root.right);
        else 
        leftView(root.left);
    }
    
    public static void main(String[] args) {
        int[] arr = { 12, 6, 15, 19, 4, 9, 13, 25, 16, 35, 23 };
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        inOrder(root);
        System.out.println();
        System.out.print("left view:-"+root.val+" ");
        leftView(root.left);
        System.out.println();
        System.out.print("Right view:-"+root.val+" ");
        rightView(root.right);
    }
}

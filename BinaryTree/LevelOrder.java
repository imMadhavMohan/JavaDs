import java.util.*;
import java.lang.*;
import java.io.*;

class LevelOrder {
    static class Node{
        Node left;
        int val;
        Node right;
        Node(int val){
            this.right = right;
            this.val = val;
            this.left = left;
        }
    }
    
    static Node insertTree(Node root, int val){
        if(root==null)
        {Node node = new Node(val); return node;}
        if(root.val > val)
          root.left = insertTree(root.left, val);
        if(root.val < val)
          root.right = insertTree(root.right, val);
        return root;
    }

    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void levelOrder(Queue<Node> q) {
        if(!q.isEmpty()){
            while(q.size()>0){
                Node root = q.poll();
                System.out.print(root.val+" "); 
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!=null)
                    q.add(root.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 19, 4, 9, 13, 25, 16, 35};
        int n = arr.length; 
        int i = 0;
        Node root = null;
        while(i<n)
          root = insertTree(root, arr[i++]);
        System.out.print("  PreOrder traversal:- ");
        preOrder(root);
        System.out.print("\nLevelOrder traversal:- ");
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);
        levelOrder(q);
    }
}

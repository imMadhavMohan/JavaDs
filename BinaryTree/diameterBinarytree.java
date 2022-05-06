import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class diameterBinarytree {
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

    static int height(Node root) {
        if (root == null) 
            return 0;            
        int l = height(root.left);
        int r = height(root.right);
        ans = Math.max(l+r+1, ans);
        return 1 + Math.max(l, r);        
    }
    
    static int diameterOftree(Node root){
        if(root==null)
            return 0;
        //1st case when root is included && height of right & left subtree
        int l  = height(root.left);
        int r  = height(root.right);
        //2nd case when subtrees are checked
        int leftsubtree = diameterOftree(root.left);
        int rightsubtree = diameterOftree(root.right);
        return Math.max(leftsubtree + rightsubtree , 1 + l + r);        
    }

    static int ans=0;

    public static void main(String[] args) {
        int[] arr = { 12, 19, 4, 9, 13, 25, 16, 35, 23 };
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        inOrder(root);
        System.out.println();
        System.out.println(diameterOftree(root)-1); // less optimize
        ans+=1;
        System.out.println("diameter: "+(ans));
    }
}

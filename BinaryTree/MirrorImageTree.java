import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MirrorImageTree {
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
        if (root != null) {
            int l = height(root.left);
            int r = height(root.right);
            return 1 + Math.max(l, r);
        }
        return 0;
    }

    static void mirrorImage(Node root){
        if(root!=null){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 19, 4, 9, 13, 25, 16, 35, 23 };
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        inOrder(root);
        System.out.println();
        System.out.println(height(root));
        System.out.println("MirrorImage:-");
        mirrorImage(root);
        inOrder(root);
    }
}

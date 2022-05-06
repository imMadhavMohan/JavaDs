import java.util.*;
class minAbsdiffBtree {
    static class Node{
        Node left;
        int val;
        Node right;
    }
    static Node newNode(int val) {
        Node node = new Node();
        node.left = null;
        node.val = val;
        node.right = null;
        return node;
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

    static Node prev;
    static Integer ans = Integer.MAX_VALUE;

    static void inOrder(Node root){ // Give sorted order
        if(root!=null)
        {            
        inOrder(root.left);
        if(prev!=null) // corner case
          ans = Math.min(root.val - prev.val, ans); // run only 1 time
        prev = root;
        inOrder(root.right);     
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 12, 19, 4, 9, 7, 25, 16, 35, 23, 40 };
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);        
        // always print a data in sorted format
        inOrder(root);
        System.out.println(ans);
    }
}

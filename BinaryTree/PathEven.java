import java.util.*;
import java.lang.*;
import java.io.*;

class PathEven{
    static class Node {
        Node left;
        int val;
        Node right;

        Node(int val) {
            this.right = right;
            this.val = val;
            this.left = left;
        }
    }

    static Node insertTree(Node root, int val) {
        if (root == null) {
            Node node = new Node(val);
            return node;
        }
        if (root.val > val)
            root.left = insertTree(root.left, val);
        if (root.val < val)
            root.right = insertTree(root.right, val);
        return root;
    }

    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    static int cnt=0;

    static void cntEvenPath(Node root, int sum, Stack<Integer> path){
        sum+=root.val;   
        path.push(root.val);
        if((sum&1)==0 && (root.left==null && root.right==null))
        {
            // System.out.println(sum+" "); 
            cnt++;
            System.out.println(path+" = "+sum);
            
            return;
        }
        
        if(root.left!=null)             
        {             
            cntEvenPath(root.left, sum, path);
            path.pop();
        }
        
        if(root.right!=null)
        {              
            cntEvenPath(root.right, sum, path);
            path.pop();
        }  
         // Back-tracking
         
    }
        
   
    public static void main(String...args) {
        int[] arr = { 1, 19, 4, 2, 3, 9, 7, 13, 18, 25, 16, 35, 23 };
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        preOrder(root);
        System.out.println();   
        Stack<Integer> path = new Stack<>();
        cntEvenPath(root, 0, path);
        
        System.out.println("total even path: "+cnt);
    }
}

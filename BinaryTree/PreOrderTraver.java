public class PreOrderTraver{
    static class Node{
        Node right;
        int val;
        Node left;
        Node(int val){
            this.right =null;
            this.val = val;
            this.left =null;
        }
    }

    static Node insertTree(Node root, int val){
        if(root==null)
         {Node node = new Node(val); return node;}
        if(root.val > val)  
          root.left = insertTree(root.left, val);
        else if(root.val < val)
          root.right = insertTree(root.right, val);
        return root;         
    }

    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");            
            preOrder(root.left);
            preOrder(root.right);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = { 12, 5, 6, 24, 4, 29, 2, 18};
        int n = arr.length; 
        int i = 0;
        while (i < n) 
           root = insertTree(root, arr[i++]); 
        
        preOrder(root);
    }
}
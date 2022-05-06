class PostOrder{
    static class Node{
        Node right;
        int val;
        Node left;
        Node(int val){
            this.left=null;
            this.val=val;
            this.right=null;
        }
    }
    static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");            
        }    
    }

    static Node insertTree(Node root, int val){
        if(root==null)
         {Node node = new Node(val); root = node; return root;}
        if(root.val > val)  
          root.left = insertTree(root.left, val);
        else if(root.val < val)
          root.right = insertTree(root.right, val);
        return root;         
    }
    public static void main(String[] args) {
        Node root=null;
        int[] arr = {12, 5, 6, 24, 4, 29, 2, 18};
        int n = arr.length;
        int i=0;
        while(i<n)
            root = insertTree(root, arr[i++]);
        postOrder(root);
    }
}
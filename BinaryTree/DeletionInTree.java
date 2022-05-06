class DeletionInTree {
    static class Node{
        Node left;
        int val;
        Node right;
        Node(int val){
            this.left=null;
            this.val = val;
            this.right=null;
        }
    }
    static Node insertTree(Node root, int val){
        if(root==null){
            Node node=new Node(val);
            return node;
        }
        if(root.val > val) 
            root.left = insertTree(root.left,val);
        if(root.val < val) 
            root.right = insertTree(root.right, val);
        return root;
    }

    static Node findMaxLeft(Node root){
        if(root.right == null)
            return root;        
        return findMaxLeft(root.right);
    }

    static Node DeleteNode(Node root, int val){
        if(root==null) return null;
        if(root.val > val)
         {root.left = DeleteNode(root.left, val);  return root;}
        if(root.val < val)
         {root.right = DeleteNode(root.right, val); return root;}
        
        if(root.val != val) return root; // val not exists 

        //we come here when we get Root to be deleted from
        // 1st case only one child exist    
        if(root.left == null)
          return root.right;
        else if(root.right == null)
          return root.left; 
        // 2nd case Both child exist           
        else { //if(root.right != null && root.left != null)
          Node temp = findMaxLeft(root.left); // InOrderPredecessor
          root.val = temp.val;  
          // Delete the InOrderPredecessor (leafNode)
          root.left = DeleteNode(root.left, temp.val);
          //temp.val = root.val as root.val has modified
        }
        return root;
    }

    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 12, 19, 4, 9, 13, 25, 16, 35 ,23};
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        inOrder(root);
        System.out.println();
        DeleteNode(root, 19);
        inOrder(root);
    }
}

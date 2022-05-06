class LCA{
    static class Node{
        Node left;
        int val;
        Node right;
        Node(int val){
            this.left = null;
            this.val = val;
            this.right = null;
        }
    }

    static Node insertTree(Node root, int val){
        if(root==null){
            Node node = new Node(val);
            return node;
        }
        if(root.val > val)
         root.left = insertTree(root.left, val);
        if(root.val < val)
         root.right = insertTree(root.right, val);
         return root;
    }

    static Node lCa(Node root, int a, int b){
        if(root==null) 
            return null;
        // if we caught any a or b , or base case where root.val = a or b
        if(root.val == a || root.val == b) 
            return root;
        // search for a and b
        Node left_lca  = lCa(root.left, a, b);
        Node right_lca = lCa(root.right, a, b);
        // both are caught common node is returned
        if(left_lca!=null && right_lca!=null) 
          return root;
       return (left_lca!=null)? left_lca : right_lca;        
    }

    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }

    static Node lca(Node root, int a,int b){
        if(root==null) return null;
        if(root.val<a && root.val<b) 
            return lca(root.right,a,b);
        if (root.val > a && root.val > b)
            return lca(root.left, a, b);
        // root.val == a || root.val == b
        return root;
    }

    public static void main(String...args){
        int[] arr = {12, 19, 4, 9, 13, 25, 16, 35 ,23};
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        inOrder(root);
        int n1 = 35, n2 = 23;
        Node lca = lCa(root,n1,n2);
        System.out.println();
        System.out.println(lca.val);
        System.out.println("alternate: "+lca(root, n1, n2).val);
    }
}
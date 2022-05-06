class internalNode{
    static class Node{
        Node right;
        int val;
        Node left;
        Node(int val){
            this.right=null;
            this.val=val;
            this.left=null;
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
    static int cntInternal(Node root) {
        if(root==null)         
           return 0;
        int cnt=0;
        if(root.left!=null || root.right!=null)
           cnt = 1+cntInternal(root.left)+cntInternal(root.right);        
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 19, 4, 9, 13, 25, 16, 35 ,23};
        int n = arr.length;
        int i = 0;
        Node root = null;
        while (i < n)
            root = insertTree(root, arr[i++]);
        System.out.println(cntInternal(root));
    }
}
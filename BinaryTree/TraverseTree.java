public class TraverseTree {    
        static class Node {
            Node left;
            int val;
            Node right;

            Node(int val) {
                left = null;
                this.val = val;
                right = null;
            }
        }

        static Node insertTree(Node root, int val) {
            if (root == null) {
                Node node = new Node(val);
                return node;
            }

            if (root.val >= val)
                root.left = insertTree(root.left, val);
            else // if(root.val <= val)
                root.right = insertTree(root.right, val);
            return root;
        }

        static void traverseTree(Node root) {
            if (root != null) {
                System.out.print(root.val);
                System.out.println(root.right);
                System.out.println(root.left);
                traverseTree(root.left);
                traverseTree(root.right);
            }
        }

        public static void main(String[] args) {
            Node root = null; // root
            int[] arr = { 12, 5, 6, 24, 4, 29 };
            int n = arr.length, i = 0;
            while (i++ < n) {
                root = insertTree(root, arr[i]);
            }
            traverseTree(root);
        }
    }



class Main{
    static class Node{
        Node next = null;
        int val;
        Node(int val){
            this.next=null;
            this.val=val;
        }
    }
    static Node head=null;
   
    static Node insert(Node head,int val){
        if(head == null)
            return new Node(val);
        head.next = insert(head.next, val);
        return head;
    }

    static Node revList(){
        Node curr=head, nextn=null, prev=null;
        while(curr!=null){
            nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        return prev;
    }
    
    static void print(Node head){
        if(head!=null){
            System.out.print(head.val+" ");
            print(head.next);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,9}; 
        int i=0;        
        while(i < arr.length)
           head = insert(head, arr[i++]);
        // addOne(); 
        print(head);
    }
}

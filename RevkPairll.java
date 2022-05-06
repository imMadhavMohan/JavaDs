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

    static Node revKpair(int k, Node head){
        if(head==null) return head;
        int i=0; Node it = head;
        while(i<k && it!=null){
            it=it.next; 
            i++;
        }
        if(i<k) return head;

        Node prev=revKpair(k, it);  i=0;
        Node curr = head, nextptr = null;
        while(i<k && curr!=null){
            nextptr = curr.next;
            curr.next=prev;
            prev=curr;
            curr = nextptr;
            i++;
        }
        return prev;
    }

    static void print(Node head){
        if(head != null){
            System.out.print(head.val+" ");
            print(head.next);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11}; 
        int i=0;        
        while(i < arr.length)
           head = insert(head, arr[i++]);        
        print(head);
        System.out.println();
        head = revKpair(3, head);
        print(head);
    }
}
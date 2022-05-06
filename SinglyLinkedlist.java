class Sll {
    public Node head;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }    

    void insert(int data){
        Node node=new Node(data);
        if(head==null)//head==null
        {
             head=node;
             head.next=null; // in java by default null
        }
        else {
            Node p= head;
            while(p.next!=null) //!=Null
            {
                //System.out.println(p.data);
                p=p.next;
            }
            p.next=node;
            node.next=null; // in java by default null
        }
    }
    void print()
    {
        Node p=head;
        System.out.println("Nodes of singly linked list: "); 
        while(p.next!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;  
        }
    }

    void deletionFront()
    {
        if(head!=null) 
        {
            head=head.next;
        }        
    }
    void deletionEnd()
    {
        if(head!=null) 
        {
            Node curr=head;
            Node prev=null;
            while(curr.next!=null)
            {
                prev=curr;
                curr=curr.next;                
            }
            prev.next=null;
        } 
    }

    public static void main(String[] args) {
        Sll node=new Sll();
        int n=0;
        while(n!=7)
           node.insert(n++);
         node.print();
         node.deletionFront();
         node.print();
         node.deletionEnd();
         node.print();
    }
}

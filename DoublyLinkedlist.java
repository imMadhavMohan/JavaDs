class DoublyLinkedlist {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
          this.next=null;
          this.data=data;
          this.prev=null;
        }
    }    

    public Node head=null;  //by default java store a null in prev and next

    // void delete(int n)//nth node
    // {
    //     if(head!=null)
    //     {
    //         int i=0;
    //         Node curr=head,previous=null;
    //         while(curr!=null && (n-1)!=i)
    //         {
    //             previous=curr;
    //             curr=curr.next;
    //             i++;
    //         }
    //         previous.next=curr.next;
    //         curr.next.prev=previous;
    //     }
    // }
    
    void insert(int data)
    {
        Node curr=head;
        Node node=new Node(data);

        if(head!=null)
        {            
            while(curr.next!=null)
              curr=curr.next;
            curr.next=node;
            node.prev=curr;
            node.next=null;                     
        }
        else {
            head.next=node;
            node.prev=head;
            node.next=null;// bydefault done by java
        }        
    }
    
    void display()
    {
        Node curr=head;
        if(curr!=null)
        {
            while(curr.next!=null)
             {
                 System.out.print(curr.data+" ");
                 curr=curr.next;
             }
            
        }
    }

    public static void main(String[] args)
    {
        DoublyLinkedlist node=new DoublyLinkedlist();        
        int n=0;
        while(n!=10)
          node.insert(n++);        
        node.display();
        //node.delete(7);
    }
}

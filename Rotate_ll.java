class list{    
    class node{
        int val;
        node next;
        node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }


    void rotate(int n){
        node curr=head;
        node end,mid,prev=null;;

        while(curr.next!=null)
            curr=curr.next;
        
        end=curr; curr=head;
        end.next=head;   
        mid=head;    

        while(n!=0)
           {prev = mid; mid=mid.next; n--;}
        prev.next=null;
        head=mid;           
    }

    public void addnode(int n)
     {
         node p=new node(n);
         if(head==null)         
             head = p;             // java by default do it             
         
         else{
             node q=head;
             while(q.next!=null)
                 q=q.next;             
             q.next=p;             // java by default do it
         }
         p.next = null;
     }

     public void display(){
         node q=head;
         while(q!=null){
             System.out.print(q.val+" ");
             q=q.next;
         }
         System.out.println(" ");
     }

    public node head=null;// head of list

    public static void main(String args[]) {
      list ll = new list();
      int n=0;
      while(n!=12)
        ll.addnode(n++);
      ll.display()  ;   
      
      ll.rotate(3);

      ll.display();
    }
}    
 
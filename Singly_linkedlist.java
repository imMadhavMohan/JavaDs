class SinglyLinkedList {         
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
           }    
        }    
     
    public Node head = null;     
              
    public void addNode(int data) {                
        Node newNode = new Node(data);                        
        if(head == null)     
            head = newNode;                         
        else {
            Node p= head;
            while(p.next!=null) //!=Null                            
                p=p.next;            
            p.next=newNode;            
        }
        newNode.next = null;
    }    
        
    public void display() {            
        Node current = head;                           
        while(current != null) {                   
            System.out.print(current.data + " ");    
            current = current.next;    
        }              
    }    
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
                     
        int n=0;
        while(n!=7) 
            sList.addNode(n++); 
                      
        sList.display();    
    }    
}    
public class Singly_ll {
    public listnode head;

    private static class listnode{
        private int data;
        private listnode next;
        listnode(int x)
        {
            this.data=x;
            this.next=null;
        }
    }
    void display()
    {
        listnode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Singly_ll list=new Singly_ll();
        listnode node1=new listnode(1);
        listnode node2=new listnode(2);
        listnode node3=new listnode(3);
        listnode node4=new listnode(4);

        list.head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;// by default to null

        display();
    }
}

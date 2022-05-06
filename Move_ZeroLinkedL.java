import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Move_ZeroLinkedL {
    static Node pushInto(Node head, int val) {
        Node newNode = new Node(val);
        if (head != null) {
            Node it = head;
            while (it.next != null)
                it = it.next;
            it.next = newNode;
        } else
            head = newNode;
        return head;
    }

    static Node moveZero(Node head){
        Node prev =head, temp=head.next;
        while(temp!=null){
            if(temp.val==0){
                Node curr = temp;
                temp=temp.next;
                // Add to begin
                prev.next = temp;
                curr.next = head;
                head = curr;
            }
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    static void print(Node head) {
        Node it = head;
        while (it.next != null) {
            System.out.print(it.val + " ");
            it = it.next;
        }
    }

    public static void main(String... args) {
        int[] arr = { 0, 4, 0, 5, 0, 2, 0, 1, 0, 1, 0 };
        Node head = null;
        for (int i = 0; i < arr.length; i++) {
            head = pushInto(head, arr[i]);
        }
        print(head);
        System.out.println();
        print(moveZero(head));
    }
}

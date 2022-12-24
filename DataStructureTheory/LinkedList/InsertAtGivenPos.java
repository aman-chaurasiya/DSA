package DataStructureTheory.LinkedList;

public class InsertAtGivenPos {
    static Node insertGivenPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null;i++) {
            curr = curr.next;
        }
        if (curr == null)
            return null;
        temp.next = curr.next;
        curr.next = temp;
        return head;


    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        Node NUllNode=null;
        SingleLinkedListImpl ll= new SingleLinkedListImpl();

        ll.print(head);
        System.out.println();

        Node node = insertGivenPos(head, 7, 15);
        ll.print(node);
    }
}

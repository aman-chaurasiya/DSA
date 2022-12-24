package DataStructureTheory.LinkedList;

public class DeleteLastNode {

    static Node deleteEnd(Node head){
        if (head==null || head.next==null)
            return null;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
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
        SingleLinkedListImpl ll= new SingleLinkedListImpl();
        Node node = deleteEnd(head);
        Node node1 = deleteEnd(head);
        ll.print(node);

    }
}

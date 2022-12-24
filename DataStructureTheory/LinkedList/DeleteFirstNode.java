package DataStructureTheory.LinkedList;

public class DeleteFirstNode {
    static Node deleteFirst(Node head){
        if (head==null){
            return null;
        }
        else
            return head.next;

    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node node2=new Node(12);
        Node node3=new Node(30);
        Node node4=new Node(40);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        SingleLinkedListImpl ll= new SingleLinkedListImpl();
        Node node = deleteFirst(head);
        ll.print(node);

    }
}

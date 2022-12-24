package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.SingleLinkedListImpl.print;

public class DeleteInSpecificPosition {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node node2=new Node(12);
        Node node3=new Node(30);
        Node node4=new Node(40);
       // head.next=node2;
        node2.next=node3;
        node3.next=node4;
        print(head);
        Node delete = delete(head, 2);
        System.out.println();
        print(delete);


    }
    static Node delete(Node head,int pos){
        if (pos==1)
            return head.next;
        Node curr=head;
        for (int i=1;i<=pos-2 && curr.next!=null;i++){
            curr=curr.next;
        }
        if (curr==null)
            return null;
        curr.next=curr.next.next;
        return head;
    }
}

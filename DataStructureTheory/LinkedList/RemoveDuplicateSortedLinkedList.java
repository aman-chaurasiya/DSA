package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.SingleLinkedListImpl.print;

public class RemoveDuplicateSortedLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node n2 = new Node(10);
        Node n3 = new Node(10);
        Node n4 = new Node(40);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(head);
        System.out.println();
        Node node = removeDuplicate(head);
        print(node);
    }
    static Node removeDuplicate(Node head){
        Node curr=head;

        while(curr!=null && curr.next!=null){
            if(curr.data== curr.next.data){
              curr.next=curr.next.next;
            }else
                curr=curr.next;
        }
        return head;

    }
}

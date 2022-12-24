package DataStructureTheory.LinkedList;

import java.util.LinkedHashSet;

import static DataStructureTheory.LinkedList.SingleLinkedListImpl.print;

public class RemoveDuplicateunSortedLinkedList {
    public static void main(String[] args) {
        Node head = new Node(15);
        Node n2 = new Node(10);
        Node n3 = new Node(8);
        Node n4 = new Node(10);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(head);
        System.out.println();
        Node node = removeDuplicatUnsortedSLL(head);
        print(node);
    }
    static Node removeDuplicatUnsortedSLL(Node head){
        LinkedHashSet<Integer> list=new LinkedHashSet<>();
        Node curr=head;
        Node prevNode=null;
        while(curr!=null){
            if(list.contains(curr.data)){
                prevNode.next=curr.next;
                curr=curr.next;
            }
            else{
                list.add(curr.data);
                prevNode=curr;
                curr=curr.next;
            }
        }
        return head;
    }

}

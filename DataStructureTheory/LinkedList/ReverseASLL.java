package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.SingleLinkedListImpl.print;

public class ReverseASLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(head);
        System.out.println();
        Node node = reverseListRecursive(head);
        print(node);

    }

    static Node reverseSLL(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
   static Node reverseListRecursive(Node head)
    {
        // code here
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverseListRecursive(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;



    }
}

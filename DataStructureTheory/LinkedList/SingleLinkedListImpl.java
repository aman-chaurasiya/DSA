package DataStructureTheory.LinkedList;

public class SingleLinkedListImpl {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;

        printRecursive(head);
        System.out.println();
        print(head);

    }
    static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
    static void printRecursive(Node head){
        if (head==null)
            return;
        System.out.print(head.data+"->");
        printRecursive(head.next);
    }

}

class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

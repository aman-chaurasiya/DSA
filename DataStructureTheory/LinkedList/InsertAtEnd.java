package DataStructureTheory.LinkedList;

public class InsertAtEnd {
    static Node insertAtEnd(Node head,int x){
        Node temp= new Node(x);
        if(head==null)
            return temp;
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;

        curr.next=temp;
        return head;

    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        SingleLinkedListImpl l1=new SingleLinkedListImpl();
        System.out.println("before insertion end");
        l1.print(head);
        System.out.println();
        System.out.println("after insertion end");
        insertAtEnd(head,40);

        l1.print(head);
        InsertBegning ll=new InsertBegning();
        System.out.println();
        System.out.println("insert at begning");

        Node node = ll.inserBegnign(head, 50);
        l1.print(node);
    }
}

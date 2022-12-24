package DataStructureTheory.LinkedList;

public class InsertBegning {

    static Node inserBegnign(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    public static void main(String[] args) {
        Node head=null;
        head=inserBegnign(head,40);
        head=inserBegnign(head,30);
        head=inserBegnign(head,20);
        head=inserBegnign(head,10);
        SingleLinkedListImpl ll=new SingleLinkedListImpl();
        ll.print(head);
    }
}

package DataStructureTheory.LinkedList;

public class MiddleOfLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        middle(head);
        System.out.println(5/2);
    }
    static void middle(Node head){
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        for (int i=0;i<count/2 && curr!=null;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
}

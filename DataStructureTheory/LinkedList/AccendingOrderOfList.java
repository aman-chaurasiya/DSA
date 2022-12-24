package DataStructureTheory.LinkedList;

public class AccendingOrderOfList {
    public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(-2);
        head.next.next=new Node(-3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(-5);

        Node node = sortList(head);
        SingleLinkedListImpl.print(node);


    }
   public static Node sortList(Node head) {
        // Your code here
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(curr.data<0 && curr!=head) { // it is negative
                prev.next=curr.next;
                curr.next=head;
                head=curr;

                curr=prev.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}

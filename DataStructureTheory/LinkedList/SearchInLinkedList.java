package DataStructureTheory.LinkedList;

public class SearchInLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        head.next=node2;
        node2.next=node3;
        int search = search(head, 10);
        System.out.println(searchRecursive(head,40));
        SingleLinkedListImpl ll=new SingleLinkedListImpl();
        ll.print(head);

    }

    static int searchRecursive(Node head, int x) {

        //Node curr=head;
        if(head==null)
            return -1;
       if(head.data==x)
           return 1;
       else{
           int res=searchRecursive(head.next,x);
           if (res==-1)
               return -1;
           else
               return res+1;
       }


    }
    static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }

        }
        return -1;

    }
}

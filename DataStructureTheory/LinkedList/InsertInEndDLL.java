package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.DoublyLL.Dprint;

public class InsertInEndDLL {
    static DNode insertEnd(DNode head,int x){
        DNode temp=new DNode(x);
        if (head==null)
            return temp;

            DNode curr=head;
            while(curr.next!=null)
                curr=curr.next;

            curr.next=temp;
            temp.pres=curr;
        return head;
    }

    public static void main(String[] args) {
        DNode head=new DNode(10);
        DNode dnode1=new DNode(20);
        DNode dnode2=new DNode(30);
        head.next=dnode1;
        dnode1.pres=head;
        dnode1.next=dnode2;
        dnode2.pres=dnode1;
        Dprint(head);
      insertEnd(head,40);
      insertEnd(head,50);
        System.out.println();
        Dprint(head);
    }
}

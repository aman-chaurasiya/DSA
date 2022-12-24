package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.DoublyLL.Dprint;

public class DeleteNodeInDLL {
    public static void main(String[] args) {
        DNode head=new DNode(10);
        DNode temp=new DNode(20);
        DNode temp1=new DNode(30);
        DNode temp2=new DNode(40);
        head.next=temp;
        temp.next=temp1;
        temp1.next=temp2;
        temp.pres=head;
        temp1.pres=temp;
        temp2.pres=temp1;


        Dprint(head);
        System.out.println();
        DNode dNode = deleteFirstNode(head);
        Dprint(dNode);
        System.out.println();
        DNode dNode1 = deleteLastNode(head);
        Dprint(dNode1);

    }
    static DNode deleteFirstNode(DNode head){
        if(head==null ||head.next==null)
            return null;
        //Node curr=head;
        head=head.next;
        return head;
    }
    static DNode deleteLastNode(DNode head){
        if(head==null ||head.next==null)
            return null;
        DNode curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
      curr.pres.next=curr.next;
        return head;
    }
}

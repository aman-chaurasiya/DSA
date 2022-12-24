package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.DoublyLL.Dprint;

public class ReverseDLL {
    public static void main(String[] args) {

        DNode head=new DNode(10);
        DNode dnode1=new DNode(20);
        DNode dnode2=new DNode(30);
        head.next=dnode1;
        dnode1.pres=head;
        dnode1.next=dnode2;
        dnode2.pres=dnode1;
        Dprint(head);
        System.out.println();
        DNode dNode = reverseDLL(head);
        Dprint(dNode);
    }
    static DNode reverseDLL(DNode head){
        if(head==null || head.next==null){
            return head;
        }
        DNode pres=null;
        DNode curr=head;
        while (curr!=null){
            pres=curr.pres;
            curr.pres=curr.next;
            curr.next=pres;
            curr=curr.pres;

        }
        return pres.pres;
    }


}

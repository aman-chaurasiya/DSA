package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.DoublyLL.Dprint;

public class InsertInBegning {
    static DNode insertStart(DNode head,int x){
        DNode temp=new DNode(x);
        temp.next=head;
        if(head!=null)
            head.pres=temp;


        return temp;

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
        DNode dNode = insertStart(head, 5);
        DNode dNode1= insertStart(dNode, 4);
        DNode dNode2= insertStart(dNode1, 3);
        System.out.println();
        Dprint(dNode2);
    }
}

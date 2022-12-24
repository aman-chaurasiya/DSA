package DataStructureTheory.LinkedList;

public class CirculerLL {
    public static void main(String[] args) {
        CNode head= new CNode(10);
        head.next=new CNode(20);
        head.next.next=new CNode(30);
        head.next.next.next=new CNode(40);
        head.next.pres=head;
        head.next.next.pres=head.next;
        head.next.next.next.pres=head.next.next;
        head.next.next.next.next=head;


        CPrint(head);



    }
    static void CPrint(CNode head){
        CNode curr = head;
        if (curr!=null)
            do
            {
                System.out.print(curr.data +" ");
                curr = curr.next;
            } while (curr != head);

    }
}
class CNode {
    int data;
    CNode next;
    CNode pres;
    CNode(int data){
        this.data=data;
        this.next=null;
        this.pres=null;
    }
}


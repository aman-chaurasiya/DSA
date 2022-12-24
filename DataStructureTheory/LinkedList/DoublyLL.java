package DataStructureTheory.LinkedList;

public class DoublyLL {
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


    }
    static void Dprint(DNode head){
        DNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"<->");

            curr=curr.next;
        }


    }


}
class DNode{
    int data;
   DNode pres;
   DNode next;
    DNode(int n){
        this.data=n;
        this.pres=null;
        this.next=null;
    }
}


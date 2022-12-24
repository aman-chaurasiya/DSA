package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.CirculerLL.CPrint;

public class InsertInStartInCLL {
    public static void main(String[] args) {
        CNode head= new CNode(10);
        head.next=new CNode(20);
        head.next.next=new CNode(30);
        head.next.next.next=new CNode(40);
        head.next.next.next.next=head;


        CPrint(head);
        System.out.println();
        CNode cNode = insertBegning1(head, 50);
        CPrint(cNode);
    }
    static CNode insertBegning(CNode head,int x){
        CNode newNode=new CNode(x);
        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
        CNode curr=head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=newNode;
        newNode.next=head;
        return newNode;
    }
    static CNode insertBegning1(CNode head,int x){
        CNode newNode=new CNode(x);
        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
       newNode.next=head.next;
        head.next=newNode;
        int t=head.data;
        head.data= newNode.data;
        newNode.data=t;
        return head;
    }
}

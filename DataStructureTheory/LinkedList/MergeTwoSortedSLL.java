package DataStructureTheory.LinkedList;

import static DataStructureTheory.LinkedList.SingleLinkedListImpl.print;

public class MergeTwoSortedSLL {
    public static void main(String[] args) {

        Node head1=new Node(2);
        Node head12=new Node(4);
        Node head13=new Node(6);
        Node head14=new Node(8);
        Node head15=new Node(10);
        head1.next=head12;
        head12.next=head13;
        head13.next=head14;
        head14.next=head15;
        Node head2=new Node(1);
        Node head22=new Node(3);
        Node head23=new Node(5);
        head2.next=head22;
        head22.next=head23;
        Node merge = merge1(head1, head2);
        print(merge);
    }
    static Node merge(Node head1,Node head2){
        if(head1==null)
        return head2;
        if (head2==null)
            return head1;
        Node ans,tail;
        if (head1.data< head2.data){
            ans=head1;
            tail=head1;
            head1=head1.next;
        }else{
            ans=head2;
            tail=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
            if (head1.data< head2.data){
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }else {
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
        }
        return ans;
    }
    static Node merge1(Node head1,Node head2){
        if(head1==null)
            return head2;
        if (head2==null)
            return head1;
        Node ans;
        Node tail;
        if (head1.data< head2.data){
            ans=head1;
            tail=head1;
            head1=head1.next;
        }else{
            ans=head2;
            tail=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
            if (head1.data< head2.data){
                tail.next=head1;
                tail=head1;
                head1=head1.next;
            }else {
                tail.next=head2;
                tail=head2;
                head2=head2.next;
            }
        }
        if(head1!=null)
            tail.next=head1;
        if (head2!=null)
            tail.next=head2;
        return ans;
    }
}

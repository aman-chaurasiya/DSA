package DataStructureTheory.Queue;

public class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        next = null;
    }
}
class QueueLL{
    Node front,rear;
    int size;
    QueueLL(){
        front=rear=null;
        size=0;
    }
    void enQueue(int x){
        Node temp= new Node(x);
        size++;
        if(front== null){
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }
    void deque(){
        if (front==null)
            return;
        front=front.next;

        if (front==null)
            rear=null;
    }
    int getFront(){
        if(front==null)
            return -1;
        return front.data;
    }
    int getRear(){
        if (rear==null)
            return -1;
        return rear.data;

    }

}

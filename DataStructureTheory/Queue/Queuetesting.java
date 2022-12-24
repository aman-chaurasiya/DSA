package DataStructureTheory.Queue;

public class Queuetesting {
    public static void main(String[] args) {
        Queue q= new Queue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.deQueue();
        q.enQueue(20);
        q.queuePrint(q);
        System.out.println();
        System.out.println( q.getFront());
        System.out.println(q.getRear());
        q.enQueue(40);
        System.out.println(q.getRear());
    }
}

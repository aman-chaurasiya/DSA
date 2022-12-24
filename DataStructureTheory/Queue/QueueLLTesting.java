package DataStructureTheory.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueLLTesting {
    public static void main(String[] args) {
        QueueLL qLL=new QueueLL();
        qLL.enQueue(10);
        qLL.enQueue(20);
        qLL.enQueue(30);
        qLL.deque();
        qLL.enQueue(25);
        qLL.enQueue(50);
        qLL.deque();
        System.out.println( qLL.getRear());
        System.out.println(qLL.getFront());
        Queue<Integer> q=new ArrayDeque<>();


    }
}

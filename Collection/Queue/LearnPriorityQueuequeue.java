package Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueuequeue {
    public static void main(String[] args) {
        Queue<Integer> prQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueuequeue = new PriorityQueue<Integer>();

        prQueue.add(24);
        prQueue.add(36);

        // add another type in queue linkedlist
        prQueue.offer(48);
        prQueue.offer(60);
        prQueue.add(12);
        System.out.println(prQueue);
//remove element

        System.out.println(prQueue.poll());
        System.out.println(prQueue.remove());
        System.out.println(prQueue);

        //peek element
        System.out.println( prQueue.element());
        System.out.println( prQueue.peek());
        Queue<Integer> prQueue2 = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        prQueue2.addAll(prQueue);
        System.out.println(prQueue2);

    }
}

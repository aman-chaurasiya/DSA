package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();





        //queue
        //add in queue linked list
        queue.add(12);
        queue.add(24);
        queue.add(36);
        // add another type in queue linkedlist
        queue.offer(48);
        queue.offer(60);
        System.out.println();
        System.out.print(queue+" ");

        System.out.println();
        //remove in queue
        System.out.println(queue.remove());;
        System.out.println(queue.poll());
        System.out.println(queue.peek()+" "+
        queue.element());




    }
}

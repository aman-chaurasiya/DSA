package Collection.Queue;

import java.util.ArrayDeque;

public class LearnArrayDequeQue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<Integer>();

        adq.offer(12);
        adq.offerFirst(24);
        adq.offerLast(36);
        adq.offer(48);
        adq.offer(60);
        adq.offer(72);
        System.out.println(adq);

        //peek
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        //poll remove

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}

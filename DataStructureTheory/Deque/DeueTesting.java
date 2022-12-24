package DataStructureTheory.Deque;

import java.util.ArrayDeque;

public class DeueTesting {
    public static void main(String[] args) {


        Deque dq= new Deque(11);
        dq.insertFront(10);
        dq.insertFront(20);
        dq.insertFront(30);
        dq.insertFront(30);
        dq.insertFront(30);
        dq.insertFront(30);
        dq.insertFront(30);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertRear(30);
        dq.insertRear(40);
        System.out.println();
        dq.printDeque();
        System.out.println();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
    }
}

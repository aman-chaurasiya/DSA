package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        //add in linked list
        linkedList.add(12);
        linkedList.add(24);
        linkedList.add(36);
        System.out.print(linkedList + " ");
//remove element
        linkedList.remove(1);
        linkedList.remove(Integer.valueOf(36));
        System.out.print(linkedList + " ");
    }
}

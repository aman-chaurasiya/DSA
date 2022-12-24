package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(12);
        linkedHashSet.add(20);
        linkedHashSet.add(15);
        linkedHashSet.add(30);
        linkedHashSet.add(1);


        linkedHashSet.remove(30);
        System.out.println(linkedHashSet);

    }
}

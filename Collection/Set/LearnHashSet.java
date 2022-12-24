package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {

        Set<Integer> hashset= new HashSet<>();
        //add element
        hashset.add(1);
        hashset.add(15);
        hashset.add(25);
        hashset.add(20);
        hashset.add(30);
        hashset.add(2);
        hashset.add(null);
        hashset.add(null);
        hashset.add(null);


        System.out.println(hashset);
        //remove element
        hashset.remove(30);
        System.out.println(hashset.contains(25));
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.size());

        System.out.println(hashset);
    }
}

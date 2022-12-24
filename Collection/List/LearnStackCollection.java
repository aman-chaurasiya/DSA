package Collection.List;

import java.util.Stack;

public class LearnStackCollection {
    public static void main(String[] args) {
        Stack<Integer> stcak= new Stack<>();
        stcak.push(2);
        stcak.push(1);
        stcak.push(3);
        System.out.println(stcak);
        System.out.println(stcak.peek());
        Integer pop = stcak.pop();
        System.out.println(pop);
        System.out.println(stcak.peek());
        System.out.println(stcak);

    }
}

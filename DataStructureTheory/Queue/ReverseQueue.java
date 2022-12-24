package DataStructureTheory.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        reverseRecursive(q);
        System.out.println(q);

    }
    static  void reverseIte(){
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    static void reverseRecursive(Queue<Integer> q){
        if (q.isEmpty())
            return;
        int x=q.poll();
        reverseRecursive(q);
        q.add(x);
    }
}

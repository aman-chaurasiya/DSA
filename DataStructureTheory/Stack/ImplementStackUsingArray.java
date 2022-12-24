package DataStructureTheory.Stack;

import java.util.Stack;

public class ImplementStackUsingArray {

    public static void main(String[] args) {
        MyStack m=new MyStack(3);
        m.peek();
        m.push(10);
        System.out.println(m.peek());
        System.out.println(m.pop());
        m.peek();
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);
        System.out.println(m.size());
        Stack<Integer> st=new Stack<>();

    }
}

class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }
    void push(int data) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int res = arr[top];
            top--;
            return res;
        }
    }
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    int size() {
        return top + 1;
    }
    boolean isEmpty() {
        return (top == -1);
    }

}

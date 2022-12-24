package DataStructureTheory.Queue;

public class Queue {
    int size, cap;
    int arr[];

    Queue(int x) {
        this.size = 0;
        this.cap = x;
        arr = new int[cap];
    }

    void enQueue(int x) {
        if (isFull()) {
            return;
        } else {
            arr[size] = x;
            size++;
        }

    }

    boolean isFull() {
        return (size == cap);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void deQueue() {
        if (isEmpty())
            return;
        else
            for (int i = 0; i < size - 1; i++)
                arr[i] = arr[i + 1];
        size--;
    }

    int getFront() {
        if (isEmpty())
            return -1;
        else return 0;
    }

    int getRear() {
        if (isEmpty())
            return -1;
        else return size - 1;
    }

    void queuePrint(Queue q) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}


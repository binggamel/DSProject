package dimigo.queue;

import java.util.Queue;

class MyQueue<T> {
    private int front;
    private int rear;
    private int size;
    private T[] queue;

    public MyQueue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        this.queue = (T[]) new Object[size];
    }

    public void enqueue(T item) {
        if (isFull()) throw new RuntimeException("Queue is empty");
        else queue[++rear] = item;

    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        else return queue[++front];

    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        else return queue[front+1];

    }

    public boolean isEmpty() {
        return front == rear;

    }

    public boolean isFull() {
        return rear == (size-1);

    }
}

public class Queue1_1 {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue(3);
        queue.enqueue("사과");
        queue.enqueue("배");
        queue.enqueue("포도");
        System.out.println(queue.peek());    // 사과
        System.out.println(queue.dequeue()); // 사과
        System.out.println(queue.dequeue()); // 배
        System.out.println(queue.dequeue()); // 포도
    }
}

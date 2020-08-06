package dimigo.queue;

class MyQueue2<T> {
    private int front;
    private int rear;
    private int size;
    private T[] queue;

    public MyQueue2(int size) {
        front = rear = 0;
        this.size = size;
        this.queue = (T[]) new Object[size];
    }

    public void enqueue(T item) {
        if (isFull()) throw new RuntimeException("Queue is Full");
        else {
            rear = (rear+1)%size;
            queue[rear] = item;
        }

    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is Empty");
        else{
            front = (front + 1)%size;
            return queue[front];
        }

    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is Emptuy");
        return  queue[(front + 1)%size];

    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1)%size == front;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        MyQueue2<String> queue = new MyQueue2(4);
        queue.enqueue("사과");
        queue.enqueue("배");
        queue.enqueue("딸기");
        System.out.println(queue.peek());    // 사과
        System.out.println(queue.dequeue()); // 사과
        System.out.println(queue.dequeue()); // 배
        System.out.println(queue.dequeue()); // 딸기
    }
}

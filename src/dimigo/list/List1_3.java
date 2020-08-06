package dimigo.list;

import java.util.EmptyStackException;

class MyLinkedListQueue<T> {
    public Node<T> front;
    public Node<T> rear;
    public int size;

    public MyLinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enQueue(T item) {
        Node nd = new Node(item);
        if(isEmpty() == true){
            front=rear=nd;
            size++;
        } else {
            rear.next = nd;
            rear = nd;
            size++;
        }

    }

    public T deQueue() {
        if(isEmpty() == true) throw new EmptyStackException();
        else {
            T data = front.data;
            front = front.next;
            if(front == null) rear = null;
            else{
                size--;

            }return data;
        }
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is Empty");

        else return front.data;
    }

    public boolean isEmpty() {
        if(front == null || rear == null || size ==0) throw new EmptyStackException();
        return false;
    }

}

public class List1_3 {
    public static void main(String[] args) {
        MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());	// "Queue is Empty" Exception
    }
}

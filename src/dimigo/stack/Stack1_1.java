package dimigo.stack;

import java.util.EmptyStackException;
import java.util.Stack;


class MyStack<T>{
    private T[] stack;
    private int top;
    private int size;

    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = (T[])new Object[size];
    }

    public void push(T item) {
        if(isFull()) throw new RuntimeException("Stack is Full");
        else{
            stack[++top] = item;
        }
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        else
            return stack[top--];

    }

    public T peek() {
        if(isEmpty());
        return stack[top];
    }

    public boolean isEmpty() {
        if(top==-1) return true;
        else return false;
    }

    public boolean isFull() {
        if(top+1<size) return false;
        else return true;
    }
}

public class Stack1_1 {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());//  false
        System.out.println(stack.peek()); // C
        System.out.println(stack.pop());  // C
        System.out.println(stack.pop());  // B
        System.out.println(stack.pop());  // A
        System.out.println(stack.pop());
    }
}
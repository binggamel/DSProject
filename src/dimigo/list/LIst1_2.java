//package dimigo.list;
//
//import java.util.EmptyStackException;
//
//
//
//class MyLinkedListStack<T> {
//    public Node<T> top;
//    public int size;
//
//    public MyLinkedListStack() {
//        this.top = null;
//        this.size = 0;
//    }
//
//    public void push(T item) {
//        Node nd = new Node(item);
//        nd.next = top;
//        top = nd;
//        size++;
//
//    }
//
//
//    public T pop() {
//        if(isEmpty() == true) throw new EmptyStackException();
//        else {
//            T top = top.data;
//            top = top.next;
//            size --;
//            return data;
//        }
//    }
//
//    public T peek() {
//        if (top == null) throw new EmptyStackException();
//        else return top.data;
//    }
//
//    public boolean isEmpty() {
//        if (top == null || size == 0) return true;
//        else return false;
//    }
//}
//
//public class LIst1_2 {
//    public class List1_2 {
//        public static void main(String[] args) {
//            MyLinkedListStack<Integer> stack = new MyLinkedListStack<>();
//            stack.push(1);
//            stack.push(2);
//            stack.push(3);
//            System.out.println(stack.peek());  // 3
//            System.out.println(stack.pop());   // 3
//            System.out.println(stack.pop());   // 2
//            System.out.println(stack.pop());   // 1
//            System.out.println(stack.pop());   // EmptyStackException 발생
//        }
//    }
//}
//
//

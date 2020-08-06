package dimigo.list;


import java.util.NoSuchElementException;


    class Node<T>{
        public T data;
        public Node<T> next;
        public Node(T item){
            data = item;
            next = null;
        }
    }
    class MyLinkedList<T> {
        public Node<T> head;
        public int size;

        public MyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        // index에 해당하는 Node를 찾아 리턴하기
        public Node<T> getNode(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
            else {
                Node p = head;
                for(int i = 0 ; i < index ; i ++){
                    p=p.next;
                }
                return p;
            }
        }

        // 리스트의 가장 앞에 노드 추가하기
        public void addFirst(T item) {
            Node<T> nd = new Node<T>(item);
            nd.next = head;
            head = nd;
            size ++;


        }

        // 리스트의 특정 인덱스에 노드 추가하기
        public void add(int index, T item) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
            else {
                if(index == 0){
                    addFirst(item);
                }else{
                    Node<T> nd = new Node(item);
                    Node<T> prev = getNode(index-1);
                    nd.next = prev.next;
                    prev.next = nd;
                    size ++;
                }
            }

            // index가 0인 경우와 그렇지 않은 경우로 나누어 구현하기 (getNode() 호출)

        }

        // 리스트의 가장 끝에 노드 추가하기
        public void addLast(T item) {
            add(size,item);
        }

        // addLast()와 동일
        public void add(T item) {
            addLast(item);
        }

        // 리스트의 처음 노드 삭제하기
        public T removeFirst() {
            if (head == null) throw new NoSuchElementException();
            else{
                T data = head.data;
                head = head.next;
                size --;
                return data;  // 삭제한 노드의 data 리턴
            }
        }

        // 리스트의 특정 인덱스 노드 삭제하기
        public T remove(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);

            // index가 0인 경우와 그렇지 않은 경우로 나누어 구현하기 (getNode() 호출)
            if(index == 0) return removeFirst();


            else {
                Node<T> prev = getNode(index-1);
                T data = prev.next.data;
                prev.next = prev.next.next;
                size--;
                return data;

            }
        }

        // 리스트의 마지막 노드 삭제하기
        public T removeLast() {

            return remove(size-1);
        }

        // removeFirst()와 동일
        public T remove() {

            return removeFirst();
        }

        // 노드들을 처음부터 순회하며 동일한 데이터가 들어있는 노드를 찾아 그 인덱스를 반환하기
        public int indexOf(T item) {
            Node<T> p = head;
            int index = 0;
            while ( p != null){
                if(p.data.equals(item)){
                    return index;
                }
                index++;
                p = p. next;
            }

            return -1;
        }

        // 리스트에서 특정 인덱스 노드의 데이터 반환하기
        public T get(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);

            // getNode() 호출하여 구현

            return getNode(index).data;
        }

        // 리스트 전체 노드를 순회하며 데이터를 StringBuilder에 담아 반환하기
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node p = head;
            while (p != null){
                sb.append(p.data);
                p = p.next;
            }


            return sb.toString();
        }
    }

public class List1_1 {
        public static void main(String[] args) {
            MyLinkedList<String> list = new MyLinkedList();
            list.add("수요일");
            list.addFirst("월요일");
            list.add(1, "화요일");
            list.addLast("목요일");
            list.add("금요일");
            System.out.println(list);                     // 월요일, 화요일, 수요일, 목요일, 금요일
            System.out.println(list.indexOf("수요일"));    // 2
            System.out.println(list.get(2));              // 수요일
            System.out.println(list.removeFirst());       // 월요일
            System.out.println(list);                     // 화요일, 수요일, 목요일, 금요일
            System.out.println(list.removeLast());        // 금요일
            System.out.println(list);                     // 화요일, 수요일, 목요일
            System.out.println(list.remove(1));           // 수요일
            System.out.println(list);                     // 화요일, 목요일
            System.out.println(list.remove());            // 화요일
            System.out.println(list);                     // 목요일
        }


}



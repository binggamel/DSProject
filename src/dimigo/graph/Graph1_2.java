//
//package dimigo.graph;
//
//
//import java.util.LinkedList;
//import java.util.Stack;
//
//class Vertex {
//    int data;
//    LinkedList<Vertex> adjacent;
//    public Vertex(int data) {
//        this.data = data;
//        adjacent = new LinkedList();
//    }
//}
//
//class Graph2 {
//    private Vertex[] heads;
//    private int size;       // 정점 개수
//
//    public Graph2(int size) {
//        heads = new Vertex[size];
//        this.size = size;
//        for(int i = 0; i < size; i++) {
//            heads[i] = new  Vertex(i);
//        }
//    }
//
//    private void checkVertex(int v1, int v2) {
//        if (v1 < 0 || v1 >= size) throw new IndexOutOfBoundsException("Index: "+ v1 + ", Size: " + size);
//        if (v2 < 0 || v2 >= size) throw new IndexOutOfBoundsException("Index: "+ v2 + ", Size: " + size);
//    }
//
//    public void addEdge(int v1, int v2) {
//        checkVertex(v1, v2);
//        Vertex a = heads[v1];
//        Vertex b = heads[v2];
//        if(!a.adjacent.contains(b)) a.adjacent.add(b);
//        if(!b.adjacent.contains(a)) b.adjacent.add(a);
//    }
//
//    public void removeEdge(int v1, int v2) {
//        checkVertex(v1, v2);
//        Vertex a = heads[v1];
//        Vertex b = heads[v2];
//        a.adjacent.remove(b);
//        b.adjacent.remove(a);
//    }
//
//    public boolean existsEdge(int v1, int v2) {
//        checkVertex(v1, v2);
//        Vertex a = heads[v1];
//        Vertex b = heads[v2];
//        return a.adjacent.contains(b);
//    }
//
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        for(int i = 0; i < size; i++) {
//            s.append(i+": ");
//            for(int j = 0; j < size; j++) {
//                if(existsEdge(i, j)) s.append(j+" ");
//            }
//            s.append("\n");
//        }
//        return s.toString();
//    }
//
//
//    public void dfs(int index) {
//        dfs(heads[index]);
//    }
//
//    // DFS : 재귀 호출
//    public void dfs(Vertex v) {
//        // 로직 구현
//    }
//
//    // DFS : 스택 이용
//    public void dfs2(int index) {
//        Stack<Vertex> s = new Stack();
//        Vertex v = heads[index];
//        s.push(v);
//        v.visited = true;
//        System.out.print(v.data + " ");
//        boolean found;
//        while (!s.isEmpty()){
//            Vertex cur = s.peek();
//            found = false;
//            for (Vertex n : cur.adjacent){
//                s.push(n);
//
//            }
//        }
//    }
//
//    public void initVisited() {
//        // 로직 구현
//    }
//
//
//}
//
//
//public class Graph1_2 {
//    public static void main(String[] args) {
//        Graph2 g = new Graph2(8);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 3);
//        g.addEdge(1, 4);
//        g.addEdge(2, 5);
//        g.addEdge(2, 6);
//        g.addEdge(3, 7);
//        g.addEdge(4, 7);
//        g.addEdge(5, 7);
//        g.addEdge(6, 7);
//
//        g.dfs(0);	// 0 1 3 7 4 5 2 6
//        System.out.println();
//
//        g.initVisited();
//        g.dfs(1);	// 1 0 2 5 7 3 4 6
//        System.out.println();
//
//        g.initVisited();
//        g.dfs2(0);	// 0 1 3 7 4 5 2 6
//        System.out.println();
//
//        g.initVisited();
//        g.dfs2(1);	// 1 0 2 5 7 3 4 6
//    }
//}

package dimigo.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
    private int[][] matrix;
    private int size;
    private boolean[] visited;    // 방문 여부

    public Graph(int size) {
        matrix = new int[size][size];
        this.size = size;
        visited = new boolean[size];
        // 생성자 구현
    }

    private void checkVertex(int v1, int v2) {
        if (v1 < 0 || v1 >= size) throw new IndexOutOfBoundsException("Index: " + v1 + ", Size: " + size);
        if (v2 < 0 || v2 >= size) throw new IndexOutOfBoundsException("Index: " + v2 + ", Size: " + size);
    }

    public void addEdge(int v1, int v2) {
        checkVertex(v1, v2);
        matrix[v1][v2] = matrix[v2][v1]=1;
    }

    public void removeEdge(int v1, int v2) {
        checkVertex(v1, v2);
        matrix[v1][v2] = matrix[v2][v1]=0;
    }

    public boolean existsEdge(int v1, int v2) {
        checkVertex(v1, v2);
        return matrix[v1][v2] == 1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i =  0 ; i < size ; i ++ ){
            s.append(i+": ");
            for (int j = 0 ; j < size ; j ++){
                s.append(matrix[i][j]+" ");

            } s.append("\n");
        }

        return s.toString();
    }

    // DFS : 재귀 호출
    public void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 0 ; i < size ; i ++ ){
            if(matrix[v][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    // DFS : 스택 이용
    public void dfs2(int v) {
        Stack<Integer> stack = new Stack();
        stack.push(v);
        visited[v] = true;
        System.out.print(v + " ");
        boolean found;
        while (!stack.isEmpty()){
            int cur = stack.peek();
            found = false;
            for(int i = 0 ; i < size ; i ++){
                if(matrix[cur][i] == 1 && !visited[i]){
                    stack.push(i);
                    visited[i] = true;
                    System.out.print(i+" ");
                    found = true;
                    break;
                }
            }
            if (!found) stack.pop();
        }
    }

    public void initVisited() {
        for (int i = 0 ; i < size ; i ++){
            visited[i] = false;
        }
    }

    // BFS : Queue 이용
    public void bfs(int v) {
        Queue<Integer> q = new LinkedList();
        q.add(v);
        visited[v] = true;
        while (!q.isEmpty()){
            int cur = q.poll();
            System.out.print(cur + " ");
            for (int i = 0 ; i < size ; i ++ ){
                if (matrix[cur][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }


}



public class Graph1_1 {
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 7);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 7);

        g.bfs(0);	// 0 1 2 3 4 5 6 7
        System.out.println();

        g.initVisited();
        g.bfs(1);	// 1 0 3 4 2 7 5 6
    }
}

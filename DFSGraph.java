import java.util.*;

class DFSGraph {
    private int vertices;
    private LinkedList<Integer> adj[];

    // Constructor
    DFSGraph(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add edge (Directed)
    void addEdge(int src, int dest) {
        adj[src].add(dest);
    }

    // DFS Utility (Recursive)
    void dfsUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : adj[v]) {
            if (!visited[next]) {
                dfsUtil(next, visited);
            }
        }
    }

    // DFS Traversal from given source
    void dfs(int start) {
        boolean visited[] = new boolean[vertices];
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {

        DFSGraph g = new DFSGraph(9);

        // Adding edges
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 6);
        g.addEdge(4, 5);
        g.addEdge(4, 7);
        
        g.addEdge(6, 7);
        g.addEdge(6, 4);
        g.addEdge(7, 5);
        g.addEdge(7, 8);

        System.out.println("DFS Traversal starting from 0:");
        g.dfs(0);
    }
}


import java.util.*;
// TO find all the strongly connected components(SSC) of a graph( SSC means a part of graph in  which you can travel from one to all other nodes. )
public class oneKosarajuAlgo { // it is DFS based algo 
    static class Edge{
        int src;
        int  dest;    
        public Edge(int s, int d ){
           this.src = s;
           this.dest = d;        
        }
    }
        static void createGraph(ArrayList<Edge> graph[]){

            for( int i =0; i < graph.length;i++){
                graph[i] = new ArrayList<>(); // arraylist create for each vertice of the array
            }
            // Sahi order mein save krne se bhi fark padta hai
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,3));
            // 2-vertex
             graph[1].add(new Edge(1,0));      
            // 3-vertex;
             graph[2].add(new Edge(2,1)); 
            // 4-vertices
             graph[3].add(new Edge(3,4));           
    
        }
        public static void topSort(ArrayList<Edge> graph[], int curr , boolean vis[], Stack<Integer> s){
            vis[curr] = true;
            
            for(int i = 0 ;i< graph[curr].size() ;i++){
                  Edge e = graph[curr].get(i);
                  int v= e.dest;
                    
                if( !vis[e.dest]){
                    topSort( graph , e.dest , vis , s); 
                }
            }
            s.push(curr); // backtracking ke waqt , inserting int he stack 
        }

        public static void kosaraju( ArrayList<Edge> graph[] , int V){ // O(v+E)
            
            // 1st step topo sort
            boolean vis[] = new boolean[V];
            Stack<Integer> s = new Stack<>();

            for( int i =0; i<V;i++){
                if( !vis[i]){
                    topSort( graph , i , vis , s);  // traversing & calling the node if they are not traversed 
                }
            }

            // step 2, transpose 
            ArrayList<Edge> transpose[] = new ArrayList[V];
            for( int i =0; i < graph.length;i++){
                vis[i] = false;
                transpose[i] = new ArrayList<Edge>(); 
            }

            for( int i =0; i<V;i++){
                for( int j =0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j); //edge = src-> dest
                    transpose[e.dest].add(new Edge(e.dest, e.src)); // reversse edge 
                }
            }

            // step 3 - Do DFS a/c to stack
            while( !s.isEmpty()){
                int curr = s.pop();
                if (!vis[curr]){
                    System.out.print("SCC ->");
                    DFS( transpose ,curr ,vis); // SCC
                    System.out.println(); // next line after each set of stringly conndected components 
                }               
            }           
        }
        // dfs for 3rd step
        public static void DFS(ArrayList<Edge> graph[] , int curr , boolean vis[]){
            System.out.print(curr+" ");
            vis[curr] = true;

            for( int i =0 ;i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if( !vis[e.dest]){
                    DFS(graph, e.dest , vis);
                    
                }           
            }
        }
        public static void main(String[] args) {
            int V = 5;
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);
            kosaraju(graph, V);
        }
}


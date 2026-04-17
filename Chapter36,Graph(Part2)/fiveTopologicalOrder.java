import java.util.*;
public class fiveTopologicalOrder {
    static class Edge{
        int src;
        int  dest;
        public Edge(int s, int d){
           this.src = s;
           this.dest = d;          
        }  
    }
    static void createGraph(ArrayList<Edge> graph[]){

        for( int i =0; i < graph.length;i++){
            graph[i] = new ArrayList<>(); // arraylist create for each vertice of the array
        }
        // Sahi order mein save krne se bhi fark padta hai
   
        // 2-vertex
         graph[2].add(new Edge(2,3));      
        // 3-vertex;
         graph[3].add(new Edge(3,1)); 
        // 4-vertices
         graph[4].add(new Edge(4,0)); 
         graph[4].add(new Edge(4,1)); 
        // 4-vertices
         graph[5].add(new Edge(5,0)); 
         graph[5].add(new Edge(5,2)); 
    }
    
    public static void TopologicalSort(ArrayList<Edge> graph[] ){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for( int i =0; i<graph.length;i++){
            if( !vis[i]){
                topSortUtil(graph , i, vis , s); // modifies dfs
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void  topSortUtil(ArrayList<Edge> graph[] , int curr  , boolean vis[] , Stack<Integer> s){

        vis[curr] = true;
        for( int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if( !vis[e.dest]){
                topSortUtil(graph , e.dest , vis , s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] =  new ArrayList[v];
        createGraph(graph);
        TopologicalSort(graph);   
    }   
}

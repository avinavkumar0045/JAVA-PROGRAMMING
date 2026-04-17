// to calculate the shortest dist to all the vertices from the source
import java.util.*;
public class threeDijikstraTheorem {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d , int w){
           this.src = s;
           this.dest = d;  
           this.wt = w;        
        }  
    }
    static void createGraph(ArrayList<Edge> graph[]){ 

        for( int i =0; i < graph.length;i++){
            graph[i] = new ArrayList<>(); // arraylist create for each vertice of the array
        }
        // Sahi order mein save krne se bhi fark padta hai
        // 0-vertex
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        // 1-vertex
        graph[1].add(new Edge(1,3,7));      
        graph[1].add(new Edge(1,2,1));      
        // 2-vertex;
        graph[2].add(new Edge(2,4,3)); 
        // 3-vertices
        graph[3].add(new Edge(3,5,1));
        // 4-vertices
        graph[4].add(new Edge(4,3,2)); 
        graph[4].add(new Edge(4,5,5)); 
    }
 
    static class Pair implements Comparable<Pair>{
        int n ;
        int path;

        public  Pair( int n , int p){
            this.n = n;
            this.path=p;
        }

        @Override
        public int compareTo( Pair p2){
            return this.path - p2.path;
        }
    }

    public static void Dijikstra( ArrayList<Edge> graph[] ,int src){
        int dist[] = new int[graph.length];// dist[i] -> src to i
        
        for( int i=0;i<graph.length;i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0)); // like intializing
        // loop
        while( !pq.isEmpty()){
            Pair curr = pq.remove();
            if( !vis[curr.n]){ // case ye hai ki agar visited nahi hai to
                vis[curr.n] = true;
                // neighbours 
                for( int i =0; i< graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if( dist[u] + wt < dist[v] ){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v ,dist[v])); // adding to PQ 
                    }
                }
            }
        }

        // print all source to vertices shortest dist
        for( int i=0; i<dist.length;i++){
            System.out.println(src + "-->"+ i + " = "+dist[i]);           
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] =  new ArrayList[v];
        createGraph(graph);

     /**            (2)        (7)
             0 --------> 1 --------> 3 --------> 5
             \          |            |           |
              \         |            |           |
              (4)      (1)          |            |
                \       v            |           |
                  ----> 2 ----> 4 ----           | (1)
                            (3)      \           |
                                      \ (5)      |
                                      v          |
                                      5 <---------
                                            */

        int src =0;
        Dijikstra(graph , src);          
    }
    
}

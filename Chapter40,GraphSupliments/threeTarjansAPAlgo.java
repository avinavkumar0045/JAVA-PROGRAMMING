// to find the "Articulation point" of the graph (✨🌟🌟)
import java.util.*;
public class threeTarjansAPAlgo {
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
           // 0-vertex
            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,3));
            // 1-vertex
            graph[1].add(new Edge(1,0));     
            graph[1].add(new Edge(1,2));       
            // 2-vertex;          
            graph[2].add(new Edge(2,0)); 
            graph[2].add(new Edge(2,1)); 
            // 3-vertices
            graph[3].add(new Edge(3,0));   
            graph[3].add(new Edge(3,4)); 
          
             // 4 vertices       
            graph[4].add(new Edge(4,3));   
        }
         //O(V+E)
        public static void dfs( ArrayList<Edge> graph[] ,int curr ,int par, int dt[] , int low[] ,int time, boolean vis[], boolean AP[]){
            vis[curr]  = true;
            dt[curr] = low[curr] = ++time;
            int children = 0;
            for( int i =0; i<graph[curr].size();i++){
                Edge e = graph[curr].get(i); // e.src-> e.dest

                //  ( neigh  = e.dest)
                if(e.dest == par ){ // case 1
                    continue ; // ignore 

                } else if ( vis[e.dest] ) { // case 2
                    low[curr] = Math.min (low[curr],dt[e.dest]);                    
                }
                else if( !vis[e.dest]){ // case 3
                    dfs(graph , e.dest, curr ,dt,low,time,vis,AP); // for neighbbour , parent is current 
                    low[curr] = Math.min(low[curr],low[e.dest]);
                    if( par != -1 && dt[curr] < low[e.dest]){ // Aritculation point condition 2
                        AP[curr] = true;
                    }
                    children++;
                }
            }
            if( par == -1 && children >1 ){
               AP[curr] = true;
            }
        }

        public static void getAP(ArrayList<Edge> graph[] , int V){
            int dt[] = new int[V];
            int low[] = new int[V];
            int time=0;
            boolean vis[]  = new boolean[V];
            boolean AP[] = new boolean[V]; // so that it dont repeat repeatedly same AP 

            for( int i =0; i<V ;i++){
                if( !vis[i]){
                    dfs(graph ,i ,-1, dt,low , time, vis,AP); // parent is -1 for 0 
                }
            } 
            for( int i =0; i<V ;i++){
                if( AP[i]){
                    System.out.println("AP : "+ i);                   
                }
            }          
        }      
    
    public static void main(String args[]){
        int V =5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }  
}

// Used to track the Bridge in the given graph
import java.util.*;
public class twoTarjansBRIDGEAlgo {
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
             graph[3].add(new Edge(3,5));   
             // 4 vertices       
             graph[4].add(new Edge(4,3)); 
            graph[4].add(new Edge(4,5)); 
               // 4 vertices       
            graph[5].add(new Edge(5,3)); 
            graph[5].add(new Edge(5,4)); 
        }

        public static void dfs( ArrayList<Edge> graph[] ,int curr ,int par, int dt[] , int low[] , boolean vis[],int time){
            vis[curr]  = true;
            dt[curr] = low[curr] = ++time;
            for( int i =0; i<graph[curr].size();i++){
                Edge e = graph[curr].get(i); // e.src-> e.dest
                // 3 cases ( neight  = e.dest)
                if(e.dest == par ){ // case 1
                    continue ; // ignore 
                }
                else if( !vis[e.dest]){
                    dfs(graph , e.dest, curr ,dt,low,vis, time ); // for neighbbour , parent is current 
                    low[curr] = Math.min(low[curr],low[e.dest]);
                    if(dt[curr] < low[e.dest]){ // bridge condition 
                        System.out.println("bridge is between "+ curr +" -->  "+ e.dest);
                    }
                } else if ( vis[e.dest] ) {
                    low[curr] = Math.min(low[curr] , dt[e.dest]);
                    
                }
            }
        }

        public static void TarjanBridge(ArrayList<Edge> graph[] , int V){
            int dt[] = new int[V];
            int low[] = new int[V];
            int time=0;
            boolean vis[]  = new boolean[V];

            for( int i =0; i<graph.length ;i++){
                if( !vis[i]){
                    dfs(graph ,i ,-1, dt,low , vis, time); // parent is -1 for 0 
                }
            }           
        }       
    public static void main(String args[]){
        int V =6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        TarjanBridge(graph, V);

    }
}

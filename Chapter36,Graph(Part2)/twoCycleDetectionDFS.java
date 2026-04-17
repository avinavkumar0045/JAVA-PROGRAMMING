import java.util.*;
public class twoCycleDetectionDFS { // CYCLE DETECTION IN UNDIRECTED GRAPH

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
        // 0- vertex;
         graph[0].add(new Edge(0,1));
         graph[0].add(new Edge(0,2));
         graph[0].add(new Edge(0,3));
        // 1-vertex
         graph[1].add(new Edge(1,0));
         graph[1].add(new Edge(1,2));
       
        // 2-vertex
         graph[2].add(new Edge(2,0));  
         graph[2].add(new Edge(2,1));  
     
        // 3-vertex;
         graph[3].add(new Edge(3,0)); 
         graph[3].add(new Edge(3,4)); 
    }

    // Detect Cycle , to call for many component  
    public static boolean DetectCycle(ArrayList<Edge> graph[]){ // O( V + E)
        boolean vis[] = new boolean[graph.length];
        for( int i =0; i<graph.length;i++){
            if( !vis[i]){ // every time we are checking of not visited cause we have to check for all the components also 
               if( detectCycleUtil(graph , vis , i , -1)){ // parent -1 cause 0 has no parent 
                 return true; // means cycle exists in one of the part
               }
            }
        }
        return false;
    }

     // detect cycle  Util for each component 
    public static boolean detectCycleUtil( ArrayList<Edge> graph[] , boolean vis[],int curr ,int parent){
        vis[curr] = true;

        for( int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            // case3dg
            if( !vis[e.dest] ){
                if(detectCycleUtil(graph, vis,e.dest, curr)){
                   return true;
                }
            } // case 1 
            else if( vis[e.dest] && (e.dest != parent)){ // yes there is cycle 
                return true;
            }
            //case-2 , do nothing -> continue 
        }
        return false;
    }

    public static void main(String[] args) {
          /*          
                   0 ------- 3
                 / |         |
                1  |         4
                 \ |
                   2
                             */
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(DetectCycle(graph));
       
        
    }
    
}

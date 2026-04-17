import java.util.*;
public class threeBipartitteGraph {
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
        
        // 1-vertex
         graph[1].add(new Edge(1,0));
         graph[1].add(new Edge(1,3));
       
        // 2-vertex
         graph[2].add(new Edge(2,0));  
         graph[2].add(new Edge(2,4));  
     
        // 3-vertex;
         graph[3].add(new Edge(3,1)); 
         graph[3].add(new Edge(3,4)); 
        // 4-vertices
         graph[4].add(new Edge(4,2)); 
         graph[4].add(new Edge(4,3)); 

    }

    public static boolean isBipartite(ArrayList<Edge> graph[] ){
        int color[] = new int [graph.length];
        for( int i =0; i<color.length;i++){ 
            color[i] = -1; // no color 
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i =0; i<graph.length;i++){ // loop for multiple components
            if(color[i] == -1) { // BFS
                q.add(i);
                color[i] = 0; // yellow

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for( int j =0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j); // e.dest
                        if(color[e.dest] == -1){  // CASE 3
                            int nextcolor = color[curr] == 0 ? 1:0; // next wale ko color de rahe hai
                            color[e.dest] = nextcolor;
                            q.add(e.dest);
                        } else if( color[e.dest] == color[curr]){ // CASE 1
                            return false ;
                        }
                        // case 2 , no conclusion 
                    }
                }
            }  
        }
        return true;
    }
    public static void main(String[] args) {
                  /*          
                   0 ------- 2
                   1        /
                   |      4
                    \   /
                     3 
                             */

        int V = 5;
        ArrayList<Edge> graph[] =  new ArrayList[V];
         createGraph(graph);
         System.out.println(isBipartite(graph));
        
    } 
}

import java.util.*;
public class oneTopologicalSortBFS {
    
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

    public static void Calcindegree(ArrayList<Edge> graph[] , int indegre[]){
        for( int i =0; i<graph.length;i++){
            int a =i;
            for( int j =0; j<graph[a].size();j++){
                Edge e = graph[a].get(j);
                indegre[e.dest]++;
            }
        }
    }
   public static void TopSort(ArrayList<Edge> graph[]){
     int indegre[] = new int[graph.length];
     Calcindegree(graph, indegre);

     Queue<Integer> q = new LinkedList<>();

     for( int i =0;i <indegre.length;i++){
        if( indegre[i] == 0){
            q.add(i);
        }
     }

     // BFS
     
      while( !q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i =0; i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indegre[e.dest]--;

                if(indegre[e.dest] ==0 ){
                    q.add(e.dest);
                }
            }
        }
       System.out.println();
   }
  
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] =  new ArrayList[v];
        createGraph(graph);
        TopSort(graph);  
    }
}

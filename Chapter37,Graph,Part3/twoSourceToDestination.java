import java.util.ArrayList;
public class twoSourceToDestination {
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
        graph[0].add(new Edge(0,3));
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
    public static void printAllPath( ArrayList<Edge> graph[] , int src , int des, String path){
       if( src == des){
        System.out.print(path+des); 
        return;
       }

       for( int i =0; i<graph[src].size();i++){
        Edge e = graph[src].get(i);
        printAllPath(graph , e.dest, des, path+src); // path + src hai yeha pe to start with 
       }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] =  new ArrayList[v];
        createGraph(graph);
        String path;
        int src =5 ; int des = 1;
        printAllPath(graph , src, des ," ");
        
            
    }
    
}

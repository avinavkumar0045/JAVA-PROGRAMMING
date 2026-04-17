import java.util.*;

public class twoBreathFirstSearch {

    static class Edge{
        int src;
        int  dest;
        int wt;

        public Edge(int s, int d, int w){
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

        // 0- vertex;
         graph[0].add(new Edge(0,1,1));
         graph[0].add(new Edge(0,2,1));
        // 1-vertex
        graph[1].add(new Edge(1,3,1));       
        graph[1].add(new Edge(1,0,1));      
       
        // 2-vertex
        graph[2].add(new Edge(2,0,1));  
        graph[2].add(new Edge(2,4,1));  
     
        // 3-vertex;
        graph[3].add(new Edge(3,1,1)); 
        graph[3].add(new Edge(3,4,1)); 
        graph[3].add(new Edge(3,5,1)); 
        
       
        // 4-vertices
        graph[4].add(new Edge(4,2,1)); 
        graph[4].add(new Edge(4,3,1)); 
        graph[4].add(new Edge(4,5,1)); 
        // 5-vertices
        graph[5].add(new Edge(5,3,1)); 
        graph[5].add(new Edge(5,4,1)); 
        graph[5].add(new Edge(5,6,1));
        //6-vertices
        graph[6].add(new Edge(6,5,1)); 

    }
    // BFS
    public static void BFS( ArrayList<Edge> graph[] ){ // O( V + E)
        
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); // source 

        while( !q.isEmpty()){
            int curr = q.remove(); // jo aaya usko curr mein save ke hata do, kyu ki tabho aage bhad payenge
            
            if( !vis[curr]){ // till viss.curr != true
                System.out.print(curr+" ");
                vis[curr] = true;
                for( int i =0 ; i< graph[curr].size();i++){ // matlab each vertex ka size kya hai,as we have stored each neighbur individually 
                    Edge e = graph[curr].get(i); // visiting neighbour 
                    q.add(e.dest); // adding neighbour to the q LL.
                }
            }
        }
    }
    // DFS O(V + E)
    public static void DFS(ArrayList<Edge> graph[] , int curr , boolean vis[]){ // for int curr , just pass the vertex number 
        //visit
        System.out.print(curr +" ");
        vis[curr] = true; // true mark kr diya 
        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i); // neighbour

            if( !vis[e.dest]){ // checking for neighbour 
                DFS(graph , e.dest, vis);
            }
        }
    }

    // Hash Path
    public static boolean HasPath(ArrayList<Edge> graph[] , int sr, int desti ,boolean[] vis){ // O(V+E)
        if( sr == desti){
            return true;
        }
        vis[sr] = true;
        for (int i =0; i<graph[sr].size();i++){
            Edge  e = graph[sr].get(i); // curr neighbour 
            // e.dest = neighbour 
            if( !vis[e.dest] && HasPath(graph , e.dest , desti , vis)){ // searcing for path frm neighbour to dest
                return true;
            }          
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("---------BFS----------");
        BFS(graph);
        System.out.println();
        System.out.println("---------DFS----------");
        DFS(graph ,0,new boolean[V]);     
        System.out.println();
       System.out.println( HasPath( graph , 0 ,5 ,new boolean [7]));
    }   
}

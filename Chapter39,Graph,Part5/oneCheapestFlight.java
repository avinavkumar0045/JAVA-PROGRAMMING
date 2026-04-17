// from src to dest with MAXIMUM K STOPS
import java.util.*;
public class oneCheapestFlight {
    static  class Edge {
        int src;
        int  dest;
        int wt;
        public Edge(int s, int d , int w){
           this.src = s;
           this.dest = d;  
           this.wt =w;        
        } 
    } 
        public static void createGraph(int flight[][],ArrayList<Edge> graph[]){
            for( int i=0; i<graph.length ;i++){
                graph[i] = new ArrayList<>();             
            }
            for(int i =0; i<flight.length;i++){
                int sr = flight[i][0];
                int des = flight[i][1];
                int w = flight[i][2];

                Edge e = new Edge(sr, des, w);
                graph[sr].add(e);
            }
        }
        static class Info{
            int v;//vertex
            int cost;
            int stops;

            public Info( int v, int c , int s){
                this.v = v;
                this.cost = c;
                this.stops = s;
            }
        }
        public static int OneCheapestFlight(int n,int flight[][] , int sr, int des,int K ){
            ArrayList<Edge> graph[] = new ArrayList[n]; // n size to store the dist at that index(node value)
            createGraph(flight, graph);

            int dist[] = new int[n];
            for( int i =0; i<graph.length;i++){
                if( i != sr){
                    dist[i] = Integer.MAX_VALUE; // Intitally sab ke distance ko infinite set kar rahe hai
                }
            }
            boolean vis[] = new boolean[graph.length];
            Queue<Info> q = new LinkedList();
            q.add(new Info(sr,0,0)); // Initialzing , vertex ,cost , stops

            while( !q.isEmpty()){
                Info curr = q.remove();
                if(curr.stops > K){
                    break; // agar K se jada stops ho jaeinge to stop
                }else{
                    for( int i =0; i<graph[curr.v].size();i++){
                        Edge e = graph[curr.v].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int price = e.wt;

                        if( curr.stops <= K && curr.cost + price < dist[v]){
                             //1) we are checking <= K,kyu ki stop at dest will also be conted by the user 
                             // 2) samjhe ?? ,agar( u tak ka 'curr' price + u->v tak ka price < src-> v tak ka price ) ,

                            dist[v] = curr.cost + price; // samjhe  🩷🩷🩷 dist[u] ke jagah curr.cost dekhna hai, global to ∞ hoga 
                            q.add(new Info(v,dist[v],curr.stops+1)); // v= src, dist[v](updated) , curr.stops+1
                        }
                    }  
                }                  
            }
            if( dist[des] == Integer.MAX_VALUE ){
                return -1;
            }else{
                return dist[des];
            }    
        }
    public static void main(String[] args) {
        int n = 4;
        int flight[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int K = 1, sr =0, des=3;
        int cheapest = OneCheapestFlight(n, flight, sr,des, K); // k+1 kyu ki algo to dest ko vi calc karenga 
        System.out.println("\nThe cheapest fligth fom src to des within K flights is: "+ cheapest+"\n" );   
    }
}

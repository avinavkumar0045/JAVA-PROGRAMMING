 // Similar to 2nd code , learn the method to enter the parameters
import java.util.PriorityQueue;

public class fiveNearByCar {
    static class distance implements Comparable<distance>{
        int x ;
        int y;
        int distSq;
        int idx;

        public  distance( int x , int y , int distSq , int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(distance d2){
            return this.distSq - d2.distSq; // ascending order 
        }        
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}} ;
        int k =2;
        PriorityQueue<distance> pq = new PriorityQueue<>();

        for( int i =0; i< pts.length ; i++){
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1] ;
            pq.add( new distance ( pts[i][0] , pts[i][1] , distSq , i));
        }
      // nearest cars
        for ( int i=0; i < k ; i++){
            System.out.println("C"+ pq.remove().idx ); // .idx ko printkarao , nahi to hexa deciml number m address de raha tha         
        }
    }
}

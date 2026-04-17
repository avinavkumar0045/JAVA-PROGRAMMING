public class MaxSubArraySum {
    public static void main(String[] args) {
        int a [] = {-1}; //2,3,-1,-5,10,12
        int ans =0; // if saare negetive number liye to , isko Integer.MIN_VALUE lenge
        int sum =0;
        for(int i =0; i<a.length;i++){
         sum += a[i];
           if(sum > ans){
           ans = sum;
           }

           if(sum < 0){
            sum  =0;  // yeha pe ans nahi , sum aayega  #######################
            }
        }
        System.out.println(ans);
    }
    
}
/* 
public static Edge{
    int src;
    int des;
    public void Edge(int s, int d){
        this.src= s;
        this.des=d;
    }
}
PriorityQueue<Edge> pq = new PriorityQueue<>();
boolean vis[] = new boolean[prerequisites.length];
pq.add(0,0);

while( !pq.isEmpty()){
    int curr = pq.remove();
    if( !vis[pq.dest]){
        vis[curr.dest];

        for( int i =0; i<prerequisites[curr].size();i++){
          Edge e = prerequisites[curr].get(i);
          pq.add(e.src,e.dest);
        }

    }else{
        return false;
    }
}
return true;
*/

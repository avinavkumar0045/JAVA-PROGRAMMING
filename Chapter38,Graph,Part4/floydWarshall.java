// to find the sortest dist between all the nodes
public class floydWarshall {
    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0,1,2}
                        ,{0,4,8}
                        ,{1,2,3}
                        ,{1,4,2}
                        ,{2,3,1}
                        ,{3,4,1}};
        int distanceThreshold = 2;

        int matrix[][]=  new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i == j){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                 
            }
        }

        for(int i =0;i<edges.length;i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            int wt = edges[i][2]; 
            matrix[src][dest]= wt;
            matrix[dest][src] = wt;           
        }
        for(int k = 0;k<n;k++){ // floyd mechanism 
            for(int i =0;i<n;i++){
                for(int j=0;j<n;j++){

                    if (matrix[i][k] != Integer.MAX_VALUE && matrix[k][j] != Integer.MAX_VALUE) {
                            matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
        int[] num = new int[n];
        for(int i =0;i<n;i++){
            int temp = 0;
            for(int j =0;j<n;j++){
                if(matrix[i][j] > 0 && matrix[i][j] <= distanceThreshold){
                    temp++;
                }  
            }
            num[i] = temp;
        }
        int ans = 0;
        for(int i =0;i<num.length;i++){
            if(num[i] <= num[ans]){
                ans = i;

            }
        }
        System.out.println(ans);

    } 
    
}

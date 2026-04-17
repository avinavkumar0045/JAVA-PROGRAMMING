class Solution {
  static class Trio{
      int r;//row
      int c;//col
      int t;//time
      Trio(int r, int c, int t){
          this.r = r;
          this.c = c;
          this.t = t;
      }
  }
  public int orangesRotting(int[][] grid) {
      Queue<Trio> pq = new ArrayDeque<>();
      int fresh =0; int maxtime =0;
      for( int i =0; i<grid.length;i++){
          for(int j =0; j<grid[0].length;j++){

              if(grid[i][j] == 2){
                  pq.add(new Trio(i,j,0));//loading new location
              }
              else if(grid[i][j] == 1){
                  fresh++;
              }
          }
      }
      // up,down,left,right
      int []dr = {-1,1,0,0};
      int []dc=  {0,0,-1,1};

      while( pq.size() > 0 ){
          Trio trio = pq.remove();
          for( int i =0; i< dr.length ;i++){
              int r = trio.r + dr[i] ;
              int c = trio.c + dc[i] ;

              if(r >=0 && c >=0 && r < grid.length && c < grid[0].length && grid[r][c] == 1){
                  pq.add(new Trio(r,c,trio.t +1));
                  grid[r][c] =2;
                  maxtime = trio.t+1;  // 
                  fresh--;
              }                                
          } 
      }  
      if( fresh == 0){
          return maxtime;
      }  else {
          return -1;
      }
  }
}
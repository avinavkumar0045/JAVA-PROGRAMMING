

public class fiveFloodFill { // submit directly
     //O( m*n)
    public static void helper(int [][] image , int sr, int sc , int color,int orgCol ){

        if(sr <0 || sc < 0 || sr >= image.length || sc >= image[0].length ){
                return ;
        }
        if (image[sr][sc] != orgCol) {
            return;
        }
        image[sr][sc] = color; // to make the changes

        //Up
        helper(image ,sr-1 , sc, color , orgCol);
        //Down
        helper(image ,sr+1, sc, color , orgCol);
        //Right
        helper(image ,sr , sc+1, color ,orgCol);
        //LEft
        helper(image ,sr , sc-1, color , orgCol);
    }

    public static int[][] floodfill(int [][] image , int sr, int sc , int color){ // O( const)
        int orgCol = image[sr][sc];
        // Edge case: if same color
        if (orgCol == color) {
            return image;
        }
        helper(image ,sr , sc, color , image[sr][sc]);
        return image ;
    }
    public static void main(String[] args) {
        int image[][] = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        int sr = 1, sc =1, color =2;
        int ans[][];
        ans = floodfill(image , sr , sc ,color);
        for(int i =0;i<image.length;i++){
            for(int j =0;j<image[0].length ; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

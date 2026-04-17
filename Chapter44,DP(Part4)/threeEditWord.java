public class threeEditWord { //Edit distance 🌟🌟
    public static int EditWord(String w1 , String w2){ //Tabular code  ; O(n *m)
        int n = w1.length();
        int m = w2.length();

        int dp[][] = new int[n+1][m+1];
        // initialize
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<m+1;j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                if(j == 0){
                    dp[i][j] = i;
                }
            }
        }
        class 
        //bottom up
        for(int i =1;i<n+1 ;i++){
            for(int j = 1; j<m+1; j++){
                if(w1.charAt(i-1) == w2.charAt(j-1)){ // same 
                    dp[i][j] = dp[i-1][j-1];

                }else{ // when different 
                    int add = dp[i][j-1] +1 ; // for adding one element
                    int delete = dp[i-1][j] + 1; // for deleting one element
                    int replace = dp[i-1][j-1] + 1; // for replacing one element
                    dp[i][j] = Math.min(add, Math.min( delete, replace));

                }
            }
        }

       return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(EditWord(word1 , word2));


    }
    
}

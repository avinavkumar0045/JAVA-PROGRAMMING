public class Permutation {
    public static void FindPermutation(String str, String ans){ // TC = O( N * N!)
        // base case
        if(str.length() == 0 ){
            System.out.println(ans);
            return ;
        }
        // recursion
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" = "abde"( c ko hatane ka tareeka)
            String NewStr = str.substring(0,i) + str.substring(i+1); // agar last mein chor diya to , khud se str.length tak le lega 
            FindPermutation(NewStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        String str  = "abc";
        FindPermutation(str, "");        
    }  
}

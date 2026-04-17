// void subset of ABC = a, bc, ac, ab,a,b,c , " "; 
public class Subset{ // JAVA mein pas

    public static void SubSet(String str, int i, String ans){ //t = O(n * 2^n)
        if( i == str.length()){ // SC = o(n)

            if( ans.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return; // JAVA mein passs by value hota hai, to when you return , the changes get erased
            // and as string is immutable so ,its automatically gets erased when returned 

            // if we use StringBuilder , we dont need extra string , the same StringBuilder will get updated , just we will have to create a 
            // Delete fxn to delete the value of stiring when returned.
        }
        SubSet(str, i+1, ans+str.charAt(i));  // YES wali line
        SubSet(str,i+1, ans); // No wali line
    }

    public  static void main(String args[]){
    String str = "aab";
    String ans  = "";
    SubSet(str, 0, ans); // ans is the string to which the answer will be copied

    }
}
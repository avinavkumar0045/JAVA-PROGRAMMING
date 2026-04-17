
       
public class Qn3LengthOfAString {

    public static int Length(String str, int idx, int count ){
        
        if(idx == str.length()){
            return count ; // YEHA HOGA RETURN COUNT *********************
        }
        char CurrChar = str.charAt(idx);
        if(CurrChar != '\0') {  
        count++;         
       
        }
       
              
        return Length(str,idx+1,count); // yeha fxn return krna hai
    }
  
    public static void main(String[] args) {
        String str = "How";
       int result =  Length(str,0,0);
        System.out.println("the size of string is "+ result );

    }
    
}

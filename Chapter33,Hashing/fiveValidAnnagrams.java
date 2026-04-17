import java.util.*;
public class fiveValidAnnagrams {
    public static void  main(String[] args) {
        String S ="race";
        String T = "care";
        
        int lenS= S.length();
        int lenT=T.length();
        System.out.println("Are both the strings Annagrams ?");
        if (lenS == lenT){

                HashMap<Character,Integer> hmS = new HashMap<>();
                HashMap<Character,Integer> hmT = new HashMap<>();

                for( int i =0;i <lenS ;i++){
                char ch =   S.charAt(i);
                if(hmS.containsKey(ch)){
                    hmS.put(ch ,hmS.get(ch)+1);
                }else{
                    hmS.put(ch,1);
                }
                }

                for( int i =0;i <lenT ;i++){
                    char ch =   T.charAt(i);
                    if(hmT.containsKey(ch)){
                    hmT.put(ch ,hmT.get(ch)+1);
                    }else{
                    hmT.put(ch,1);
                    }
                }
              //  System.out.println("Are both the strings Annagrams ?");
                System.out.println(hmS.equals(hmT));

        }else{
          System.out.println("false");
        }




        
    }
    
}

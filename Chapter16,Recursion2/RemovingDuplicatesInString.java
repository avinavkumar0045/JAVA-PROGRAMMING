// IIIIMMMMPPPOOORRRAAANNNTTT
//DO STACK ANALYSIS

public class RemovingDuplicatesInString { // Only small alphabetts
    // Individually traverse kro , agarr phele nahi aaya hai to add to new string 
    public static void Duplicate(String str, int i, StringBuilder newStr , boolean map[]){

        if( i == str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam 
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] ==  true ){
            // duplicate present 
            Duplicate(str, i+1,newStr,map);

        }else{
            map[currChar -'a'] = true;
            Duplicate(str, i+1,newStr.append(currChar),map); // appending

        }       

    }
    public static void main(String[] args) {
        String str = "avinav";
        
        Duplicate(str, 0,new StringBuilder(""), new boolean[26] ); // we didi not make variables , yehi bana diya 
                        
    }

}
    




public class Palindrome { // Is a String is Palindrome
    public static void main(String args[]){
        String name = "racecar";
        int done = 0;
        for(int i=0;i<name.length();i++){
           if(name.charAt(i) != name.charAt(name.length()-1-i)){ // charAt(i) is the term to  be used
            done =1;
            break;
           }

        }
        if(done == 1){
            System.out.println(name+" is not a palindrome");
        }else{
            System.out.println(name +" is a palindrome");
        }

    }
    
}

import java.util.*; // count lower case vowels

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String s = sc.nextLine();
        int count =0;

        for(int i=0;i<s.length();i++){
            char sca = s.charAt(i);
            if(sca == 'a' || sca == 'e' || sca == 'i' || sca == 'o' || sca == 'u' ){
                count++;
            }

        }
        System.out.println("the number of lowercase vowels : "+ count);
    }
    
}

public class CharacterPattrn {
    public static void main(String[] args) { 
        int n =5;
        char ch ='A';
       /*  for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++; // TO jump to next character
            }
            System.out.println("\n");
        }
    }
    
} */ 
// SIR'S EASY METHOD
    
 for(int i =1; i<=n; i++){
    for(int j=1;j<=n;j++){
        if(j <= i){
            System.out.print(ch);
            ch++;  
        }
    }
    System.out.println();
 }
}
}

public class InvertedHalfPyramid {
    public static void main(String[] args) {
       /*  for(int i=0;i<=5;i++){ // STARTS FROM 0
            for(int j=1;j<=5-i;j++){//STARTS FROM 1
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
    
}*/
// EASY METHOD BY SIR

      int n=5;
    for(int i =1; i<=n; i++){
    for(int j=1; j<=n;j++){
     if(i+j<= n+1){
       System.out.print(j);
     }
    }
     System.out.println();
   }
   }
}

 

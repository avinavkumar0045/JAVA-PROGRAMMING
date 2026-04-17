import java.util.*;
public class tenUnionAndSet {
    public static void main(String[] args) {

        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};

        // FOR UNION    
      HashSet<Integer> hs = new HashSet<>(); // using set property

        for(int i =0; i<arr1.length;i++){
          hs.add(arr1[i]);

        }
        for(int i =0; i<arr2.length;i++){
            hs.add(arr2[i]);
  
        }
        System.out.println("The union set of arr1 and arr2 is :");
        System.out.println(hs);


        // FOR INTERSECTIONS 
        
        HashSet<Integer> hm1 = new HashSet<>(); 

        for(int i =0; i<arr1.length;i++){
            hm1.add(arr1[i]);     
        }
        System.out.println("The intersections are ");

        for(int i =0; i<arr2.length;i++){

            if(hm1.contains(arr2[i])){
                System.out.println(arr2[i]);
                hm1.remove(arr2[i]);  //  SO, KI AGAR FIR SE DUSRI SAME ELEMENT arr2 MEIN AAYE TO FIR SE NA PRINT HO
            }
        }
        
        
      

    }
    
}

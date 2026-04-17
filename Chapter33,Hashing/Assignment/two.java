import java.util.*;
public class two {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(2,0);
        hs.put(7,1);
        hs.put(11,2);
        hs.put(15,3);
      //  hs.add(5);
       int arr[] = new int[2];
        // Using Iterator     
       
      int k =9;
        // Using Advanced Loop
        for(Integer key : hs.keySet()){  
            if( hs.containsKey(k -hs.get(key))){
                arr[0] =hs.get(key);
                arr[1] = hs.get(k - hs.get(key));
            }
        }

        for( int i =0; i<2 ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
      
}

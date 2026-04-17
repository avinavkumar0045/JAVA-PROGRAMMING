import java.util.*;
public class fourMajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1,3,2,5,1,3,1,5,1};
        int n = arr.length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for( int i =0 ; i< n ;i++){
           int num = arr[i];

            if( hm.containsKey(num)){
                hm.put(num , hm.get(num)+1);

            }else{
                hm.put(num , 1);
           }

      // shortCut , use get or default value 
          // hm.put(arr[i] , hm.getOrDefault(arr[i], defaultValue:0)+1); one liner 
        }
        System.out.println("The key with more occurances than (size of array /3) is :");
        for(Integer key : hm.keySet()){
            if(hm.get(key) > n /3){
                System.out.println(key);
            }

        }
    }
    
}

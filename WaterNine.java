import java.util.*;
public class WaterNine {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,21,1,1,1,5,5,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i< arr.length ; i++){
            if( map.containsKey(arr[i])){
                map.put( arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        for (Integer key : map.keySet()) {
             System.out.println("Frequency of "+ key +" is "+map.get(key));
        }






        
    }
}

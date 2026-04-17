import java.util.ArrayList; //😎😎😎
// The given list is sorted in ascending order already , find one pair of elements 
                           // BRUTE FORCE
public class SixPairSumOne { // O(n^2)
    public static void PairSum1(ArrayList<Integer> list, int target){
      
       
       for(int i =0; i<list.size() ; i++){
        for(int j =i+1; j<list.size();j++){
            if(list.get(i) + list.get(j) == target){
                System.out.println(list.get(i) + " "+list.get(j));
                return; // we just needed one pair so returned 
            }
        }
       }
       System.out.println("No pair for this target exists "); // outsidde all loops
    }
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();
      // 1, 2,3,4,5,6
       height.add(1);
       height.add(2);
       height.add(3);
       height.add(4);
       height.add(5);
       height.add(6);
       PairSum1(height,5);

       
        
    }
    
}

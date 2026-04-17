import java.util.ArrayList;

public class SevenPairSumOneA {
    public static Boolean PairSum2(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size()-1;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
                
            } if(list.get(lp) + list.get(rp) < target){
                lp++;
                              
            }else {
                rp--;
            }
        }
        return false;
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
        System.out.println( PairSum2(height,5));
      
    }
    
}

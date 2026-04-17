import java.util.ArrayList; // USING MODULAR ARITHMETIC 
public class EightPairSumTwo {  
        public static Boolean PairSum2(ArrayList<Integer> list, int target){
            int bp = -1;
            int n = list.size();
            for(int i =0; i<list.size();i++){
                if(list.get(i) > list.get(i+1)){
                    bp = i; // as starts from 0 , issi ko breaking point bolte hai 
                    break;
                }
            }
            int lp =(bp+1); // smallest 
            int rp = bp ; // remember RP = BP( when the element is largest )   
            while(lp != rp){
                // case 1
                if(list.get(lp) + list.get(rp) == target){
                    return true;
                                     
                } if(list.get(lp) + list.get(rp) < target){
                    lp = (lp+1 )% n; // $$$$$$$$$$$$$$$                              
                }else {
                    rp = (n+rp -1) % n;
                }
            }
            return false;
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
      // 11,15,6,8,9,10 ( Sorted & Rotated Array) // so not in ascending order 
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);
      
      System.out.println( PairSum2(list,16)); // its boolean , print it 
      
    }
    
}

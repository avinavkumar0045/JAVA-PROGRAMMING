import java.util.ArrayList; //🙃🙃
                                          // 2 POINTER APPROCH 

public class FiveContainerWithMostWater { // O(n)
    public static void StoreWaterEfficiently(ArrayList<Integer>height, int LP, int RP ){
     
        int area =0;
        while(LP < RP){

            int LH = height.get(LP); // INKO ANDAR INITIALIZE KRO TABHI UPDATE HOGA 
            int RH = height.get(RP);
           
            int min = Math.min(LH, RH);
            int width = RP - LP;
            if(area <  ( min * width)){ // condition
                area = min * width;

            }
            if( LH < RH){
                LP ++;
            }else{
                RP--;
            }
        }
        System.out.println("The maiximum water that can be contained is " +area+" unit^2");
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
      // 1, 8, 6, 2, 5 , 4, 8, 3, 7
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
       StoreWaterEfficiently(height, 0,height.size()-1);
        
    }
    
}

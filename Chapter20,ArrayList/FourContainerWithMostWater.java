import  java.util.ArrayList;//😎😎😎
public class FourContainerWithMostWater {
    // For given n lines on x-axis , use 2 lines to form a container such that it holds maximum water .

                                               // BRUTE FIRCE APPROCH
    public static void StoreWater(ArrayList<Integer>height, int i  , int j ){ // O(n^2)
        int area = Integer.MIN_VALUE;
        for(  i =0; i<height.size(); i++){ // Both the loops will run till the end
            for( j =i+1; j< height.size();j++){ // Both the loops will run till the end

                int min = Math.min(height.get(i), height.get(j));// to make the code look easy in the next step;

                if(area < ((j -i)* min)){ // j-1 refers width
                    area = ((j -i)* min);
                }
            }
        }
        System.out.println("the maximum area is "+area+" unit^2");
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
       StoreWater(height, 0,0);

        
        
    }
    
}

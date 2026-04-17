public class Question4 { // Trapping water question

    public static int TrappedWater(int heights[]){
        int totalvolume =0;
        int n = heights.length;

        //calculate left max height:
        int []leftmax = new int[heights.length];
        leftmax[0] = heights[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(heights[i] , leftmax[i-1]);
        }

        // calculate rightmax height:
        int []rightmax = new int[n];
        rightmax[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){  // from n-2
            rightmax[i] = Math.max(heights[i] , rightmax[i+1]);
        }
         
        //loop
        for(int i=0;i<n;i++){
            //Calculate water level 
            int WaterLevel = Math.min(rightmax[i] , leftmax[i]);
             //calculate water stored
            totalvolume += (WaterLevel - heights[i])  * 1 ;  // we are considering width for all is same =1. 
        }

        return totalvolume;

    }
    public static void main(String[] args) {
        int heights[] = {4,2,0,3,2,5};
        System.out.println("Total water stored :"+TrappedWater(heights));

    }
    
}

public class TrappingRainwater {
      
    public static int TrappedWater(int height[]){ // time complexity O(n) , n= height
        int n = height.length;
        int trappedLiquid = 0;

        // cal left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){ // loop starts from 1
          leftMax[i] =  Math.max(height[i], leftMax[i-1]);
        }
        
        // cal right max boundary - array
        int RightMax[] = new int[n];
        RightMax[n -1]= height[n -1];
        for(int i =n-2;i>=0;i--){  // loop starts from n-2
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(left Max Bounday, Right max boundary)
            int WaterLevel = Math.min(leftMax[i],RightMax[i]);

            //waterlevel = min(left Max Bounday, Right max boundary)
            trappedLiquid += WaterLevel - height[i];
        }
       // System.out.println( "Total Trapped water is :"+trappedLiquid);
        return trappedLiquid;       
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5}; //
       // TrappedWater(height);
        System.out.println(TrappedWater(height));

    } 
}

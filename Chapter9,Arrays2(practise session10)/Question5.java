public class Question5 { //Related to triplet return // to do
 
    public static void TripletReturn(int nums[]){
    int n = nums.length;
    int currsum = 0;
    

    for(int i=0;i<n;i++){
        
        for(int j=i+1;j<n;j++){
        
            for(int k=0;k){ // DIMAG LAGAO
                if(nums[i] + nums[j] + nums[k]  == 0);
                System.out.println(nums[i]+ " "+nums[j]+" " +nums[k]);

            }
        }
    }
}

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        TripletReturn(nums);

    }
    
}

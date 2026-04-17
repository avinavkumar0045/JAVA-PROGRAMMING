

public class BubbleSorting { // Bubble Sort
    public static void BubbleSort(int nums[]){
        int n =nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j] > nums[j+1]){  // A lot of swapping takes place in inner loop
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }               
            }
        }
        System.out.println("In Ascending order:");
       for(int i=0;i<n;i++){ // Ascending order
        System.out.print(nums[i]+" ");
       }
       System.out.println();
       System.out.println("In Descending order:");
       for(int i=n-1;i>=0;i--){  // descending order
        System.out.print(nums[i]+" ");
       }
        
    }
    public static void main(String[] args) {
        int nums[] = {2,4,3,7,5,9,10};
        BubbleSort( nums);

        
    }
    
}

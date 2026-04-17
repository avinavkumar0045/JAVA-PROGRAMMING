

public class SelectionSorting { // sabse phele sabse chota element nikalo aur usko, sabse suruaat mein push kar do, and repeat

    public static void SelectionSort(int nums[]){
        int n=nums.length;
        
        for(int i=0;i<n-1;i++){ // upto n-2 , so <n-1
            int minidx = i;
            for(int j =i+1;j<n;j++){ // uptp n-1, so <n
               if(nums[minidx]> nums[j]){ // Here we avoid large number of swapping as we did in bubble sort
                   minidx = j; // we will do swapping in the outer loop , Inside bahut swapping ho jayengi 
               }
            }
            // swap
            int temp =nums[minidx];
            nums[minidx] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Ascending order:");
        for(int i=0;i<n;i++){ // ascending order
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        System.out.println("Descending order:");
        for(int i=n-1;i>=0;i--){ // descending order
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
      int nums[] = {2,4,3,7,5,9,10};
        SelectionSort( nums);
        
    }
    
}
  
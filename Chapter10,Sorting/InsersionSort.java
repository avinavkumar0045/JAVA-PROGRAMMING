//(PRACTICE SEESION 11 1:28 MIN)

public class InsersionSort { // INspiration from pack of cards , maante hai ki ek sorted hai, and then uske respect mein bbaakiyo ko right place pe place krte hai
    //Pick an Elment from the unsorted part and place in the right position in the sorted part
    // Called Insersion sort, cause what is the correct place of insersion, we find that

    public static void InsertionSorting(int nums[]){ // O(n^2)
        int n=nums.length;
        
        for(int i=1;i<n;i++){ // upto n-2 , so <n-1, kyu ki agar 4 ko bhi sahi jagah pahucha denge , to array sort ho jaiega
            int curr = nums[i]; // temp variable
            int prev = i-1; // kyu ki peeche wale sab sorted hai, to isko i-1 wale se compare kro, if replaced, then for i-1 wale se 

            // Finding out correct posn. to insert
            while(prev >= 0 && nums[prev] >curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            //Insertion
            nums[prev+1] = curr;
        }

        // Printing
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
        int nums[] = {2,4,3,7,5,10};
         InsertionSorting( nums);
    }
    
}

public class LastOccurence {
    public static void LastOcr(int arr[], int i, int x){ // TC O(n)
        if(i == 0){ // SC O(n) // here only condn at i ==0
            System.out.println("Element not present ");
            
        }
        if(arr[i] == x ){
            System.out.print("Element is present at "+i+"th index");
            
        }
        else{
            LastOcr(arr, i-1, x); // yeha i++ nahi krna sirf, function wapis call for i+1 // remember
        }
    
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,2,1,2};
        LastOcr(arr,arr.length-1,1); // here only length-1

    }
    
}

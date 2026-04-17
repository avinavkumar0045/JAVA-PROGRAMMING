public class Firstoccurence {

    public static void FirstOcr(int arr[], int i, int x){ // TC O(n)
        if(i == arr.length){ // SC O(n)
            System.out.println("Element not present ");          
        }
        if(arr[i] == x ){
            System.out.print("Element is present at "+i+"th index");          
        }
        else{
            FirstOcr(arr, i+1, x); // yeha i++ nahi krna sirf, function wapis call for i+1 // remember
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,2,5,2};
        FirstOcr(arr,0,2);

    }  
}

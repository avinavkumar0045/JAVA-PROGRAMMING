public class ArraySortedOrNot { // O(n)

    public static boolean isSorted(int arr[], int i){  // in parameter show its an array ( arr[])
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){ // ye hoga kyu ki i ki value wo pass karenge call krte waqt , jaha se start hoga
            return false;
        }
        return isSorted(arr,i+1); // 0diye hai to increase hi hoga
    }
   
    public static void main(String[] args) {
        int arr[] = {1,46,3,45};
        System.out.println(isSorted(arr,0)); // i = starting position // no arr[] in calling 

    }
}

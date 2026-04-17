 //Copy 24/1 

public class QuickSort{

    public static void  printArr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort( int arr[], int si, int ei){

        if( si >= ei){
            return;
        }

        int PIdx = Partition(arr, si, ei); // partition index 
        quickSort( arr, si+1, PIdx);
        quickSort(arr,PIdx+1, ei );
    }

     // 1 , sabse phele partition se hi to pivot niklega 
    public static int Partition(int arr[], int si, int ei){ // Sabse phele partition hota hai 
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot 
        for( int j =si; j<ei; j++){
            if(arr[j] < pivot){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]
        arr[i] = temp;
        return i; // stored pivot in i
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,4,6,3,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
        
    }
}


    


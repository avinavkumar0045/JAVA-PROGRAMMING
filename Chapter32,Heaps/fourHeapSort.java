public class fourHeapSort {

    public static void Heapify(int arr[] , int i, int size){

        int left = 2*i +1;
        int right = 2*i +2;
        int maxIdx = i;
       
        if( left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if( right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if( maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            Heapify( arr, maxIdx ,size );
        }
    }
    public static void HeapSort(int arr[]){
        // step1 = create Max Heap
        int n = arr.length;
        for( int i = n/2 ; i>= 0 ; i--){
            Heapify( arr ,i ,n); // sath mein last wla index no bhi de rahe hai, kyu ki har baar last wale ko chorna bhi hai 
        }

        // step:2 - push largest at end
        for( int i = n-1 ; i>0 ;i--){
            // swapping ( largest first element with the smallest one )
            int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;
             Heapify(arr , 0, i);
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        HeapSort(arr);
        for( int i =0 ;i< arr.length ; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    
}

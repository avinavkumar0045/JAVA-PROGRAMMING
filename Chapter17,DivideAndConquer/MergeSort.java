// Merge sort , mein aadha aadha baat ke -> repeat till all are individual and then -> 
// and sort them in there half and then merge 

public class MergeSort {
    public static void  MergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return ;
        }
        // Kaam
        int mid = si + ( ei - si) / 2 ; // (si + ei )/ 2 // Mid nikala 
      
        MergeSort(arr, si, mid);// Right Part // Wahi kaam left part ke liye 
        MergeSort(arr, mid+1, ei); // Left Part // wahi part right part ke liye , till base case
        Merge(arr, si, mid, ei);
    }

    // Merge to merge the sorted half 
    public static void Merge(int arr[], int si, int mid, int ei) {
        // left = [0, 3] =4; right = [4,6] =3; ->6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i]; // storing in another variable while merging in ascending order
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
             k++;
        }
        // LEFT PART
        while( i <= mid){
            temp[k++] = arr[i++];
        }
        // RIGHT PART
        while( j <= ei){
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for(k =0, i = si; k<temp.length ; k++ , i++){
            arr[i] = temp[k];
        }       
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,5,4,2};
        MergeSort( arr, 0,4);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }   
}

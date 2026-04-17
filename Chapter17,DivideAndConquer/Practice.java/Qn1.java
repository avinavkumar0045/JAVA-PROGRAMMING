// 🤖🤖
public class Qn1 { // compareTo for string
    public static void MergeSorting(String arr[], int si, int ei ){
       // Base Case
        if(si >= ei){
            return ;
        }
        int mid = (si + ei); // 🥹🥹😍😍

        MergeSorting(arr, si, mid);
        MergeSorting(arr, mid+1, ei);
        Merge(arr,si, mid, ei);
      
    }
    public static void Merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si +1];
        int i = si ;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j <= ei){
          if(arr[i].compareTo(arr[j] ) < 0){
            temp[k] = arr[i];
            i++;
           }else{
            temp[k] = arr[j];
            j++;
           }
           k++;
        }
        
        // Left part
        while( i<= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for( k =0, i=si; k <temp.length; k++, i++){ //  entering elements to the temp array
            arr[i] = temp[k];

        }
    }

    public static void main(String args[]){
        String arr[] = { "sun", "moon","water","air"};
        MergeSorting(arr, 0, arr.length-1);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
       
    }
    
}

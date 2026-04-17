

public class Searching {
    public static int  search(int arr[], int tar, int si, int ei){
        // kaam 
        int mid = si + ( ei - si )/ 2;
        // case Found 
        if(arr[mid] == tar){
            return mid;

        }
        // mid on L1
        if(arr[si] <= arr[mid]){
                // case a : left           
                if(arr[si] <= tar && tar <= arr[mid]){
                    return search(arr, tar , si, mid -1);

                }else{
                    return search(arr, tar , mid+1 , ei) ;
                }
            
        }
        // mid on L2
        else{
            // case 2 : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search( arr,tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid -1);
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,2};
        int target  = 0;
        int tarIdx = search(arr, target , 0, arr.length-1);
        System.out.println("The index of the target is " + tarIdx);        
    }
    
}


public class try2{
    public static void rec(int arr[] , int si , int ei){
        if( si < ei){
        int mid = si+((ei-si) /2);
        
        rec( arr ,si , mid );
        rec(arr, mid+1 ,ei);
        rec2(arr ,si,mid ,ei);
        }else{
            return ;
        }
    }
    public static void rec2(int arr[] , int si , int mid, int ei){
        int temp[] = new int[ei-si+1];
        int  i =si ;
        int j = mid+1;
        int k = 0; // remember
        while( (i <= mid )&& (j <= ei)){
            if(arr[i] < arr[j]){
               temp[k] = arr[i];
               i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Left part 
        while( i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for( k = 0, i = si ; k < temp.length ; k++ ,i++){ // finally modyfiying the arr array by replacing the 'temp' to 'arr'
            arr[i] = temp[k] ;
        }     
    }
    public static void main(String args[]){
         int arr[] = {2,1,4,5,6};
         int n = arr.length;
        rec(arr, 0, n-1);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();    
    }
}


class Solution {
    public double myPow(double x, int n) {
        double a = 1;
        if(x == 0 || x == 1){
            return x;
        }else{
            if( n > 0){
                for(int i = 1;i<=n ; i++){
                    a = a * x;
                } 
                return a;
            }else{
                for(int i = 1 ; i<= Math.abs(n) ; i++){
                    a = a / x;
                }
                return a;
            }
 
        }

    }
}




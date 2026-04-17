// Segment tree , used when we have to do updation in the array and find quries efficiently
public class oneSegmentTree {

    static int tree[]; 

    public static void init(int n){ // initializing 
        tree = new int[4 * n]; // hadd some extra space for saety
    }
    public static int buildST(int arr[] , int i , int start , int end){

        if(start == end){ // base case of leaf 
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2;
        buildST(arr , 2*i+1 , start , mid); // for left subtree -  2*i +1
        buildST(arr , 2*i+2 , mid+1 , end); // for right 2*i +2
        tree[i] = tree[2*i +1 ] + tree[2*i + 2]; // value of the ith index 
        return tree[i] ;
    }
    //2nd question
     public static int getSumUtil(int i , int si, int sj , int qi , int qj){
        if( qj <= si || qi >= sj){ // non-overlapping 
            return 0;
        }
        else if( si >= qi && sj <= qj){ // complete overlap
           return tree[i];
        }
        else{ // partial overlap
           int mid = (si + sj) / 2;
           int left =  getSumUtil((2*i +1) , si , mid , qi, qj);
           int right = getSumUtil((2*i + 2), mid+1, sj, qi, qj); 
           return left+right;

        }
     }
    public static int  getSum(int arr[],int qi , int qj){
        int n = arr.length;
        return  getSumUtil(0, 0, n-1, qi, qj);

    }

    // 3rd qn ( UPDATION)
    public static void UpdateUtil(int i , int si, int sj , int idx, int diff){ // for updation in segment tree
        if(idx >= sj || idx <= sj){
            return;
        }
        tree[i] += diff;
        if( si != sj){ // non leaf condn
           int  mid = (si + sj) /2;
           UpdateUtil(2*i+1, si, mid, idx, diff); // left
           UpdateUtil(2*i+2, mid+1, sj, idx, diff); // right
        }
    }
    public static void Update( int arr[] , int idx , int newval){ // for updation in tree 
        int n = arr.length;
        int diff = newval - arr[idx];
        arr[idx] = newval;

        UpdateUtil(0, 0, n-1, idx, diff);

    }
    public static void main(String[] args) {
        int arr[]= { 1, 2,3,4,5,6,7,8};
        int  n = arr.length;
        init(n);
       buildST(arr , 0 , 0 , n-1);

        for(int i = 0;i<tree.length ; i++){
            System.out.print(tree[i] + " ");
        }System.out.println();

        //2nd qn
        System.out.println(getSum(arr , 2, 5)); // qi and qj are index  
       
         // =========== ================ ============= ================ //
        // After Updation
        System.out.println("-------------------");
        System.out.println("After Updation at index 2 , with new value '2'");
        
        Update(arr, 2, 2);
        //now printing things againn
        
        // building 
        buildST(arr , 0 , 0 , n-1);

        for(int i = 0;i<tree.length ; i++){
            System.out.print(tree[i] + " ");
        }System.out.println();

        //get Sum
        System.out.println(getSum(arr , 2, 5)); // qi and qj are index 

        
    } 
}

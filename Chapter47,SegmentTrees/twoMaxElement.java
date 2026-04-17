// here we first build the segment tree of elements and te=hen we do the query , to find the maxm element in the given subaray
public class twoMaxElement {
    static int[] tree;
    public static void init(int n){
        tree = new int[4*n]; // 4n tree size 
    }
    public static void  BuildTree(int arr[], int i, int si , int sj ){
        int n = arr.length;
        if( si == sj){
            tree[i] = arr[si];
            return ;
        }
        int mid = (si+ sj ) /2;
        BuildTree(arr , 2*i +1 ,si , mid ); // i hoga 'n' nahi
        BuildTree(arr, 2*i +2 , mid+1 , sj );
         tree[i] = Math.max(tree[2*i +1 ] , tree[2*i + 2]);
    }
    
    // TO Get Max
    public static int getmaxUtil(int i , int si, int sj,  int qi , int qj ){
        if( qj < si || qi > sj){ // non-overlapping 
            return Integer.MIN_VALUE;
        }
        else if( si >= qi && sj <= qj){ // complete overlap
           return tree[i];
        }
        else{ // partial overlap
           int mid = (si + sj) / 2;
           int left =  getmaxUtil((2*i +1) , si , mid , qi, qj);
           int right = getmaxUtil((2*i + 2), mid+1, sj, qi, qj); 
           return Math.max(left ,right);

        }
    }
    public static int getmax(int arr[] , int qi, int qj){
        int n = arr.length;
        return getmaxUtil(0, 0 , n-1,qi, qj );
    }
    // update

    public static void UpdateUtil(int i , int si, int sj , int idx, int newval){ // for updation in segment tree
        if(idx > sj || idx < si){
            return;
        }
        tree[i] += Math.max(newval , tree[i]);
           if( si != sj ){
           int  mid = (si + sj) /2;
           UpdateUtil(2*i+1, si, mid, idx, newval); // left
           UpdateUtil(2*i+2, mid+1, sj, idx, newval); // right
           }     
    }

    public static void Update( int arr[] , int idx , int newval){ // for updation in tree 
        int n = arr.length;
        arr[idx] = newval;
        UpdateUtil(0, 0, n-1, idx, newval);

    } 
    public static void main(String[] args) {
        int arr[] = { 6, 8,-1 ,2,17,1,3,2,4};
        int n = arr.length;
        init(n);

        BuildTree(arr, 0, 0, n-1);
        for(int i = 0;i<tree.length;i++){
            System.out.print(tree[i] +" ");

        }System.out.println();
         System.out.println(getmax(arr, 2, 5));

         Update(arr, 2, 20);
         System.out.println(getmax(arr, 2, 5));
    }
    
}

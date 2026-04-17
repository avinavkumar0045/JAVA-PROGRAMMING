public class SubArray { // A continuous part of array
    public static void main(String[] args) {  // Nested loop (3)      
        int marks[] = { 2,3,4,5,6};
        subarrays(marks);
    }
    public static void subarrays(int marks[]){ // O(n^2)      
        int ts =0;int sum = 0;
        for(int i=0; i<marks.length;i++){  // Phele start nikala
            int start = i;
            for(int j=i; j<marks.length;j++){ // fir, end nikala
                int end = j;
                for(int k = start; k<= end;k++){ // to print //  or for(k =i; k<=j;k++)
                    System.out.print(marks[k]+" ");             
                }
                ts++; // will be in 2nd ineer loop
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are :"+ ts);    
    }
}
/* logic building of these nested loops used here 
start = 2                <- I
and   = 3,4,5,6          <- J
(2,3) ,(2,3,4),(2,3,4,5),(2,3,4,5,6) <- K */
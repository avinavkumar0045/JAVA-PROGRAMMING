public class QnCountingSort { //COUNTING SORT QUESTION, PRINT IN DECREASING ORDER

    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }

    }

    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1]; // causes started from 0; so largest +1
        for(int i=0;i<count.length;i++){
            count[arr[i]]++; // agr maan lo arr[i] =3 hai, to uski frequency 1 se update kr dunga
        }
         // Sorting
        int j=0;
        for(int i=largest;i>= 0;i--){ // decreasing ke liye, bass ye for loop ko ulta chalao
            while(count[i] > 0){ // while ke andar sab same hi rahega , no ched  chad , (increasing or decreasing)
               /*  arr[j] =i;
                j++;
                count[i]--;*/

                System.out.println(i+" "); // sortcut, iske baad to print fn bhi nahi likhna padega
                count[i]--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] ={3,6,2,1,1,8,7,4,5,3,1};
      
        CountingSort(arr);
        printArr( arr);
    }
    
}

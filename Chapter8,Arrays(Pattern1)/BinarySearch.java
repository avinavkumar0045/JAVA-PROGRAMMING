import java.util.Scanner;
public class BinarySearch {  // Binary search mein phele sort, then search in first/ seacond half .....
    public static void main(String[] args) { // eg. Dictionary ,// time complexity = (log n )to base 2
        int marks[] = {2,4,1,5,3,6,9};
        int x = marks.length;

        System.out.println("Enter the key to search :"); 
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for(int i=0; i<x-1;i++){  // UPTO x-1
            for(int j=0; j<x-1;j++){  // Bubble sort mein nested loops hota hai, naaki sirf , ek hi
                if(marks[j] > marks[j+1]){
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                
                }
            }
        }
        System.out.println("the sorted array is:");
        for(int i=0; i<x;i++){ 
            System.out.print(marks[i]+" "); // printing sorted loops
        }

        System.out.println("\nindex is: " + binarysearch(marks, key));
    }
     
    // BUBBLE SORTING
    public static int binarysearch(int marks[], int key){ 
        int start =0,  end = marks.length-1;
        
        while(start <= end){  
            int mid = (start + end) / 2 ;// jab tak

          if ( key == marks[mid]){ 
            return mid;
          } if(key < marks[mid]){
            end = mid-1;

          }else{
            start = mid+1;
         }
        }
        return -1; // yani false

    }
    
}



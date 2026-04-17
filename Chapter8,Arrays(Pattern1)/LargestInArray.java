
public class LargestInArray {  // Find largest elemnt
    public static void main(String[] args) {
        int marks[] = { 52, 43,57, 1, 89};
        int x = marks.length;

        System.out.println( "the length of array is" +x);  // here x =5, its printing length, not largrst index

        for(int i=0; i<x-1;i++){  // UPTO x-1
            for(int j=0; j<x-1;j++){
            if(marks[j] > marks[j+1]){
                int temp = marks[j];
                marks[j] = marks[j+1];
                marks[j+1] = temp;
            
            }
        }
        }
        System.out.println("the sorted array is:");
        
        for(int i=0; i<x;i++){
         System.out.println(marks[i] + " ");
        }
        

        System.out.println("the largest elemnt is: " +marks[ x-1]);  // Not x
        
    }
    
}

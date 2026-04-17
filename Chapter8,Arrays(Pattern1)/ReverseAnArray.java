public class ReverseAnArray {// ******************
    public static void main(String[] args) {
        int marks[] = { 23, 45, 54, 67, 32};
        int x = marks.length;
        int first = 0, last = marks.length -1; // USE FIRST AND SECOND LOGIC
        while(first < last){          //NO FOR LOOP
            //swap
           int temp = marks[first];
           marks[first] = marks[last];
           marks[last] = temp;
           first++;
           last--;
        }
        for(int i=0; i<x;i++){
            System.out.print(marks[i] + " ");
        }
    }  
}

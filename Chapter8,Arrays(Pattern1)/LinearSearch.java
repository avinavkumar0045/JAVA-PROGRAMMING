

public class LinearSearch {
    public static void main(String[] args) {
        int marks[] = { 23,45,65,98,76};
        int x = marks.length;

        for(int i=0; i<x;i++){
            if( marks[i] == 98){  // TO find the index of 98
                System.out.println(i);
            }
        }
    }
    
}

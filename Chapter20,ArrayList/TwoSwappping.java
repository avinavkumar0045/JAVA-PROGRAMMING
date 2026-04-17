import java.util.ArrayList; // Important 
import java.util.Collections; // Important 

// SWAPPPING AND SORTING 

public class TwoSwappping { // For Swapping 

    public static void Swapping(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1); // Stored value of 2nd index
        list.set(idx1, list.get(idx2)); // placed (value of 5th index) at 2nd inedx 
        list.set(idx2 ,temp ); // placed (value of 2nd index) at 5ht index 
        System.out.println("List after Swapping is : ");
       System.out.println(list);
       
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(9);
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(3);
        System.out.println("The original list is ");
        System.out.println(list);

        int idx1 = 2; 
        int idx2 = 5;
        Swapping(list, idx1, idx2);

        // SORTING 

        System.out.println("The array after Sorting is :");
        Collections.sort(list);
        System.out.println(list);
        // Rverse Sorting 
        System.out.println("The array after Sorting in reverse order is :");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
    
}

import java.util.ArrayList;

// ARRAY LIST , it is dynamic in Size.
public class firstMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
       // ArrayList<String>list1 = new ArrayList<>();
       
       // ADD
       list.add(1); // O(1)
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       System.out.println(list);

       //GET
      System.out.println( list.get(2)); //O(1)

      // REMOVE
      list.remove(2); // O(n)
      System.out.println("List after removing element \n"+ list);

      // SET
      list.set(2,3); // IT REPLACES , does not add
      System.out.println(list);

      // contains
      System.out.println(list.contains(5));

      // ADD with index
      list.add(1,9);
      System.out.println(list);

      // printing the array List
      System.out.println(list.size());
      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();

      // Reverse of ArrayList
      System.out.println("The Reversed List is : ");
      for(int i=list.size()-1; i>=0;i--){
        System.out.print(list.get(i) + " ");
      }
      System.out.println();

     System.out.println("Maximum element of the list is :" );
     int max = Integer.MIN_VALUE;
     for(int i =0; i<list.size()-1 ; i++){
        if(max < list.get(i)){
            max = list.get(i);
        }
        //   OR
       // max = Math.max(max, list.get(i));
     }
      System.out.println(max);    
   }
}
      
      




    

    


import java.util.ArrayList;
// MULTI-DIMENSIONAL ARRAYLIST , WHICH STORES MORE THAN 1 ARRAY LIST IN IT     
public class ThreeMultiDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // Adding quickly 
        for(int i =1; i<=5 ; i++){
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);

        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // CAN PRINT DIRECTLY 
        System.out.println("Directily printing the  Multi dimensional Array");
        System.out.println(mainlist);
        System.out.println();

        // PRINTING WITH THE HELP OF FOR LOOP
        System.out.println("Printing the  Multi dimensional Array with the help of NESTED LOOP");
        for(int i =0; i<mainlist.size(); i++){
            ArrayList<Integer>currList = mainlist.get(i); //♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️ , storing Ith list of mainlist in currList

            for(int j =0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");

            }
            System.out.println();
        }




    }
    
}

import java.util.ArrayList;
import java.util.Collections; 
// Lonely element when element appears and has no adjacent numbers
public class Lonely {
    public static void Lonely(ArrayList<Integer>list){
        ArrayList<Integer> list1 = new ArrayList<>();
        /* // Direct krne pe error de raha hai
         for(int i =0; i<=list.size()-1 ;i++){
            if((list.get(i +1 ) != list.get(i)+1) && (list.get(i-1) != list.get(i)-1)){
                list1.add(list.get(i));
            }

        }
        System.out.println(list1); */
         
        if(list.get(1) != (list.get(0)+(1 ))  && list.get(0) != list.get(1)){ // LAst walle ke liye case banana padega 
            list1.add(list.get(0));

        }if(list.get(list.size()-2) != list.get(list.size()-1)-1  && list.get(list.size()-2) != list.get(list.size()-1)){ // First wale ke liye case banana padega
            list1.add(list.get(list.size()-1));
        }else{
            for(int i =0; i<list.size()- 1;i++){ // General case from 1 to size -2
                if((list.get(i +1 ) != list.get(i)+1) && (list.get(i-1) != list.get(i)-1)){
                    list1.add(list.get(i));
                }
            }

        }
        System.out.println("The lonely elements are :");
        System.out.println(list1); 
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(21);
        Collections.sort(list);
        System.out.println(list);
        Lonely(list);
        
    }
    
}

import java.util.HashMap;
public class elevenItenaryFromTickets {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revmap = new HashMap<>(); // rev Map of (to , from), yeha se starting point nikalenge 
        for(String key : tickets.keySet()){
            revmap.put(tickets.get(key),key);
        }

        for(String key :tickets.keySet()){
            if( !revmap.containsKey(key)){ // aab reverse krne ke baad , dono ke key comapre kr liye , jo nahi hai , wahi starting point hoga
                return key; // starting point 
            }      
        }
        return null;
    }
    public static void main(String[] args) { //O(n)
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" --> "+tickets.get(start));
            start = tickets.get(start); // wapis start mein store kara diye , so next tp next hashmap koj paye 
        }
        System.out.println();

    }
}

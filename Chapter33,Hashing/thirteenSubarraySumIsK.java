import java.util.HashMap;

public class thirteenSubarraySumIsK { // return the number of subarray with the sum 0;
    public static void main(String[] args) { // // O(n)
         int arr[] ={1,2,3};
         int k =3;
        
        HashMap<Integer,Integer> map = new HashMap<>(); // sum , indx 
        map.put(0,1);

        int sum =0;
        int count =0;

        for(int j =0;j<arr.length ;j++){
            sum += arr[j]; // sum(j)
            if(map.containsKey(sum -k)){
                count += map.get(sum-k);
        
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println("no of  subarray with sum as K :"+ count);
    }
    
}

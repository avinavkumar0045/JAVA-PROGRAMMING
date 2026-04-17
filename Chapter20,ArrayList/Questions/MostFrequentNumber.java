// EK Array diya hua hai, jisme ek key de rakha hai,
// aur pure array mein jo number's uske baad aayege unme jiski frequency sabse jada hogi wo Target hai
import java.util.HashMap;
public class MostFrequentNumber { // 2190 LEETCODE 
    public static int mostFrequent(int[] nums, int key) {
            int count =0; // frequency of different target elements 
            int target = 0; // target with most frequency 
            HashMap<Integer,Integer> map = new HashMap<>(); // so that we can store the target with value(occurence )
            for(int i =0; i<(nums.length) -1;i++){ // only till n-2
    
                if(nums[i] == key){ // here only i
                    if(map.containsKey(nums[i+1]) == false){ // i+1
                       map.put(nums[i+1], 1);
                    }else{
    
                       map.put(nums[i+1] , map.get(nums[i+1] ) + 1); // rememeber its i+1  
                    }
                    if(map.get(nums[i+1]) > count){ // to compare count of each target 
                        count = map.get(nums[i+1]);
                        target = nums[i+1];
                }

            }          
        }
        return target;
    
    }
    public static void main(String[] args) {
        
        int nums[] = { 1,100,1,200,1,100,1,200,1,100};
       
        int key = 1;
       System.out.println( mostFrequent(nums ,key));



        
    }
    
}

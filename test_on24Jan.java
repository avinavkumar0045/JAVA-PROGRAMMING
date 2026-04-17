import java.util.*;
public class test_on24Jan {
    public static void main(String[] args) {
        System.out.println("Special Multiples");
        int ans[] = new int[30];
        int count = 0;
        int idx = 0;
        int i =1;

        while(count < 30){
            int num = 7 * i;
            if(num % 4 == 1 && (num % 5 == 1 && num % 6 == 1)){
                ans[idx] = num;
                idx++;
                count++;
            }
            i++;
        }
        for(int j = 0;j<ans.length; j++){ // ans for level 1
            System.out.print(ans[j]+" , "); 
        }
        //Level 2 
        // repeating digits 
        System.out.println("\n\n -------------- Reapeting Digit Analysis ----------- ");
        int repeat = 0;
        ArrayList<Integer> remainder = new ArrayList<>();

        for(int t = 0;t< ans.length; t++){
            HashMap<Integer, Integer> map = new HashMap<>();
            int curr = ans[t];
            
            while( curr > 0){
                int rem = curr % 10;
                if( !map.containsKey(rem)){
                    map.put( rem , 1);
                }else{
                    remainder.add(ans[t]);
                    repeat++;
                    break;
                }
                curr = curr / 10;
            }
        }
        
        for(int m = 0;m<repeat; m++){
            System.out.print(remainder.get(m) +",");
        }

        // LEvel 3 ( PRime - adjacent )
        System.out.println("Prime Adjacent");
        ArrayList<Integer> level3 = new ArrayList<>();
        for(int c = 0;c<ans.length; c++){
              primeAdjacent( ans[c], level3);
        }
        System.out.println("\n\nThe prime-adjacent number are :");
        int sumOfPrime = 0;
        for(int temp = 0;temp< level3.size(); temp++){
            System.out.print(level3.get(temp)+",");
            sumOfPrime += level3.get(temp);
        }
        System.out.println("The sum of prime - adjacent is : "+ sumOfPrime);
    }

    public static void primeAdjacent(int x ,ArrayList<Integer> level3 ){ // fxn for prime Adjacent 
        int ptr = 0;
        for(int i= 1; i < 6; i++){
            int curr = x+i;
            for(int j=2;j<curr;j++){ // prime numbers 
                if(curr % j == 0){
                    ptr = 1;
                    break;
                }
            }
            if(ptr == 0 && curr > 1){
                level3.add(x);
                break;         
            }
        }
    }
}
